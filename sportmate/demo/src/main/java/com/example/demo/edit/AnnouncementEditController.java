package com.example.demo.edit;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * The 'AnnouncementEditController' class is responsible for functioning the edit an Announcement's information in the app.
 */
public class AnnouncementEditController implements Edit{
    @FXML
    private TextField title;
    @FXML
    private TextArea content;
    @FXML
    private DatePicker date;
    @Override
    /**
     * Confirms and saves the edited announcement's information to data.
     * Retrieves the input values from the input fields, creates a new Announcement object, and updates the data using FileUtil.
     * Connected to the 'confirm' button.
     */
    public void editConfirm() {

    }

    /**
     * Initializes the Announcement Edit view, filling selected Announcement info to the input fields.
     */
    @Override
    public void initialize() {

    }


}
