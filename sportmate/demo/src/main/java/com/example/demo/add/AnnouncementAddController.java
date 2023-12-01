package com.example.demo.add;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * The 'AnnouncementAddController' class is responsible for the function of adding a new Announcement in the app.
 */
public class AnnouncementAddController implements Add{
    @FXML
    private TextField title;
    @FXML
    private TextArea content;
    @FXML
    private DatePicker date;

    /**
     * Initializes the Announcement Add view.
     */
    @Override
    public void initialize() {

    }

    /**
     * Connected to confirm button in the add scene, Adds a new team with the provided information to the data store.
     */
    @Override
    public void addConfirm() {

    }
}
