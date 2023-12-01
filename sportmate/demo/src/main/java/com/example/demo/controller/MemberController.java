package com.example.demo.controller;

import com.example.demo.Util.FileUtilM;
import com.example.demo.HelloApplication;
import com.example.demo.Member;
import com.example.demo.edit.MemberEditController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

/**
 * The 'MemberController' class is responsible for controlling the functionality of the Member view in the application.
 */
public class MemberController implements Controller{
    @FXML
    private TableView<Member> tableViewM;
    @FXML
    private TableColumn<Member, String> name;
    @FXML
    private TableColumn<Member, String> age;
    @FXML
    private TableColumn<Member, String> gender;
    @FXML
    private TableColumn<Member, String> email;
    @FXML
    private TableColumn<Member, String> phone;
    @FXML
    private TableColumn<Member, String> team;

    /**
     * Initialize the Member view by populating the TableView with member data.
     */
    @FXML
    public void initialize(){
        getData();
    }

    /**
     * Retrieves and display member data in the TableView.
     */
    private void getData(){
        List<Member> members = FileUtilM.readData();
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        team.setCellValueFactory(new PropertyValueFactory<>("team"));

        tableViewM.setItems(FXCollections.observableList(members));
    }

    /**
     * Display the 'Add Member' scene by calling the addM method from the HelloApplication class.
     */
    @FXML
    public void showAddM(){
        HelloApplication.addM("addM.fxml");
    }

    /**
     * Allows the user to change a selected member's info and opens edit member scene.
     */
    @FXML
    public void editMember(){
        Member member = tableViewM.getSelectionModel().getSelectedItem();
        if (member != null){
            MemberEditController.edit(member);
            HelloApplication.addM("editM.fxml");
        }
    }

    /**
     * Deletes the selected member's data.
     */
    @FXML
    public void deleteMember(){
        Member member = tableViewM.getSelectionModel().getSelectedItem();
        if (member != null){
            FileUtilM.deleteData(member.getName());
            getData();
        }
    }

    /**
     * Refreshes and updates the member data.
     */
    @FXML
    public void refresh(){
        getData();
    }

    /**
     * Navigates to the 'Team-View' scene.
     */
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    /**
     * Navigates to the 'Event-View' scene.
     */
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
    /**
     * Navigates to the 'Gallery-View' scene.
     */
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
    /**
     * Navigates to the 'Announcement-View' scene.
     */
    @FXML
    public void goAnnouncement(){
        HelloApplication.changeStage("announcement-view.fxml");
    }
    /**
     * Navigates to the 'Login-View' scene.
     */
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }
    /**
     * Navigates to the 'Dashboard-View' scene.
     */
    @FXML
    public void goDashboard(){
        HelloApplication.changeStage("dashboard-view.fxml");
    }
    /**
     * Navigates to the 'Member-View' scene.
     */
    @FXML
    public void goMember(){
        HelloApplication.changeStage("member-view.fxml");
    }
}