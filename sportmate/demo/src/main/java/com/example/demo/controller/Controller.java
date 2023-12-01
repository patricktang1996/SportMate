package com.example.demo.controller;

import javafx.fxml.FXML;
/**
 * The 'Controller' interface provides a contract for classes that control the navigation and actions within the application.
 */
public interface Controller {
    /**
     * Navigates to the "Team View" scene.
     */
    public void goTeam();
    /**
     * Navigates to the "Event View" scene.
     */
    @FXML
    public void goEvent();
    /**
     * Navigates to the "Member View" scene.
     */
    @FXML
    public void goMember();
    /**
     * Navigates to the "Gallery View" scene.
     */
    @FXML
    public void goGallery();
    /**
     * Navigates to the "Announcement View" scene.
     */
    @FXML
    public void goAnnouncement();
    /**
     * Logs out the current user and returns to the login scene.
     */
    @FXML
    public void logout();
    /**
     * Navigates to the dashboard view.
     */
    @FXML
    public void goDashboard();

}
