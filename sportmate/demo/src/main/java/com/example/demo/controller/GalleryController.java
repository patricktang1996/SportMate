package com.example.demo.controller;

import com.example.demo.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * The 'GalleryController' class is responsible for controlling the functionality of the gallery view in the application.
 */
public class GalleryController implements Controller{
   ImageView pic;
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

    @Override
    @FXML
    public void goDashboard() {
        HelloApplication.changeStage("dashboard-view.fxml");
    }

    /**
     * Allows the user to add a new picture to the gallery.
     */
    @FXML
    public void addPicture(){}
    /**
     * Allows the user to edit an existing picture in the gallery.
     */
    @FXML
    public void editPicture(){}
    /**
     * Allows the user to delete an existing picture from the gallery.
     */
    @FXML
    public void deletePicture(){}
    /**
     * Displays the next picture in the gallery.
     */
    @FXML
    public void nextPicture(){}
    /**
     * Displays the previous picture in the gallery.
     */
    @FXML
    public void previousPicture(){}
}
