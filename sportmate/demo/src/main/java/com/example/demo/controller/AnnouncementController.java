package com.example.demo.controller;

import com.example.demo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * The 'AnnouncementController' class is responsible for controlling the functionality of the announcement view in the application.
 */
public class AnnouncementController implements Controller {
    TextArea content;
    Label date, title;
    /**
     * Navigates to the "Team View" scene.
     */
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

    }
    /**
     * Logs out the current user and returns to the login scene.
     */
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }

    @Override
    @FXML
    public void goDashboard() {
        HelloApplication.changeStage("dashboard-view.fxml");
    }

    /**
     * Allows the user to add a new announcement.
     */
    @FXML
    public void addAnnouncement(){}
    /**
     * Allows the user to edit an existing announcement.
     */
    @FXML
    public void editAnnouncement(){}
    /**
     * Allows the user to delete an existing announcement.
     */
    @FXML
    public void deleteAnnouncement(){}
    /**
     * Displays the next announcement.
     */
    @FXML
    public void nextAnnouncement(){}
    /**
     * Displays the previous announcement.
     */
    @FXML
    public void previousAnnouncement(){}
    /**
     * Allows the user to send an email related to the announcement.
     */
    @FXML
    public void sendEmail(){}

}
