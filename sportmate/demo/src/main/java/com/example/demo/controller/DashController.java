package com.example.demo.controller;

import com.example.demo.HelloApplication;
import javafx.fxml.FXML;
/**
 * The 'DashController' class is responsible for controlling the functionality of the dashboard view in the application.
 */
public class DashController implements Controller {

    String instruction;
    /**
     * Navigates to the "Team View" scene.
     */
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    /**
     * Navigates to the "Event View" scene.
     */
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
    /**
     * Navigates to the "Member View" scene.
     */
    @FXML
    public void goMember(){
        HelloApplication.changeStage("member-view.fxml");
    }
    /**
     * Navigates to the "Gallery View" scene.
     */
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
    /**
     * Navigates to the "Announcement View" scene.
     */
    @FXML
    public void goAnnouncement(){
        HelloApplication.changeStage("announcement-view.fxml");
    }
    /**
     * Logs out the current user and returns to the login scene.
     */
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }
    /**
     * Navigates to the "Dashboard View" scene.
     */
    @Override
    public void goDashboard() {

    }
    /**
     * Change the content of the instruction on the "Dashboard View" scene.
     */
    public void changeInstruction(){

    }
}
