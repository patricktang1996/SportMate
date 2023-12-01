package com.example.demo.edit;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
/**
 * The 'GalleryEditController' class is responsible for functioning the edit a Gallery's information in the app.
 */
public class GalleryEditController implements Edit {
    @FXML
    private TextField title;
    @FXML
    private ImageView pic;
    @FXML
    private DatePicker date;
    @Override
    /**
     * Confirms and saves the edited gallery's information to data.
     * Retrieves the input values from the input fields, creates a new Gallery object, and updates the data using FileUtil.
     * Connected to the 'confirm' button.
     */
    public void editConfirm() {

    }


    /**
     * Initializes the Gallery Edit view, filling selected Gallery info to the input fields.
     */
    @Override
    public void initialize() {

    }


}
