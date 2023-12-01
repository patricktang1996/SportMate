package com.example.demo.edit;

import com.example.demo.Util.FileUtilM;
import com.example.demo.Member;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * The 'MemberEditController' class is responsible for functioning the edit a Member's information in the app.
 */
public class MemberEditController implements Edit{
    @FXML
    private TextField name;
    @FXML
    private TextField age;
    @FXML
    private ChoiceBox<String> gender;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private TextField team;

    private static Member selected;
    /**
     * Sets the member to be edited. This method is called before initializing the view to pass the selected member's information.
     *
     * @param selected The Member object to be edited.
     */
    public static void edit(Member selected){
        MemberEditController.selected = selected;
    }
    /**
     * Initializes the Member Edit view, setting the gender choice options to "male" and "female," and pre-filling input fields from data.
     */
    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("male", "female");
        name.setText(selected.getName());
        age.setText(selected.getAge());
        gender.setValue(selected.getGender());
        email.setText(selected.getEmail());
        phone.setText(selected.getPhone());
        team.setText(selected.getTeam());
    }
    /**
     * Confirms and saves the edited member's information to data.
     * Retrieves the input values from the input fields, creates a new Member object, and updates the data using FileUtil.
     * Connected to the 'confirm' button.
     */
    @FXML
    public void editConfirm(){
        Member member = new Member(name.getText(), age.getText(), gender.getValue(), email.getText(), phone.getText(), team.getText());
        FileUtilM.editData(member);
    }
}
