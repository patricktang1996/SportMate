package com.example.demo.add;

import com.example.demo.Util.FileUtilM;
import com.example.demo.Util.StringUtil;
import com.example.demo.Member;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * The 'MemberAddController' class is responsible for the function of adding a new member in the app.
 */
public class MemberAddController implements Add {
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
    @FXML
    private Label ageError;
    @FXML
    private Label nameEmptyError;
    @FXML
    private Label ageEmptyError;
    @FXML
    private Label genderEmptyError;
    @FXML
    private Label emailEmptyError;
    @FXML
    private Label phoneEmptyError;
    @FXML
    private Label teamEmptyError;
    @FXML
    private Label phoneError;

    /**
     * Initialize the Member Add View, setting the gender choice options to male and female.
     */
    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("male", "female");
    }

    /**
     * Add the Member info to data, connected to conform button.
     */
    @FXML
    public void addConfirm(){
        boolean isValid = true;
        String ageText = age.getText();
        String phoneText = phone.getText();
        if (name.getText().isEmpty()){
            nameEmptyError.setVisible(true);
            isValid = false;
        }else {
            nameEmptyError.setVisible(false);
        }
        if (age.getText().isEmpty()){
            ageEmptyError.setVisible(true);
            isValid = false;
        }else {
            ageEmptyError.setVisible(false);
        }
        if (gender.getValue() == null){
            genderEmptyError.setVisible(true);
            isValid = false;
        }else {
            genderEmptyError.setVisible(false);
        }
        if (email.getText().isEmpty()){
            emailEmptyError.setVisible(true);
            isValid = false;
        }else {
            emailEmptyError.setVisible(false);
        }
        if (phone.getText().isEmpty()){
            phoneEmptyError.setVisible(true);
            isValid = false;
        }else {
            phoneEmptyError.setVisible(false);
        }
        if (team.getText().isEmpty()){
            teamEmptyError.setVisible(true);
            isValid = false;
        }else {
            teamEmptyError.setVisible(false);
        }
        if (!isInteger(ageText)){
            ageError.setVisible(true);
            isValid = false;
        }else {
            ageError.setVisible(false);
        }
        if (!isInteger(phoneText)){
            phoneError.setVisible(true);
            isValid = false;
        }else {
            phoneError.setVisible(false);
        }
        if (isValid){
            Member member = new Member(name.getText(), age.getText(), gender.getValue(), email.getText(), phone.getText(), team.getText());
            FileUtilM.addData(member);
        }
    }
  
    
    public Member addConfirmCheck(String name, String age, String gender, String email, String phone, String team){
    	Member member = null;
        boolean isValid = true;
        if (name.isEmpty())  
        	isValid = false;
        if (age.isEmpty())
            isValid = false;
        if (gender.isEmpty())
            isValid = false;
        if (email.isEmpty())
            isValid = false;
        if (phone.isEmpty())
            isValid = false;
        if (team.isEmpty())
            isValid = false;
        if (!isInteger(age))
            isValid = false;
        if (!isInteger(phone))
            isValid = false;
        if (isValid)
            member = new Member(name, age, gender, email, phone, team);
        return member;
    }

    
    private boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
