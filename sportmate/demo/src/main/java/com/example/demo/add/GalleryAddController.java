package com.example.demo.add;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
/**
 * The 'GalleryAddController' class is responsible for the function of adding a new Gallery in the app.
 */
public class GalleryAddController implements Add{
    @FXML
    private TextField title;
    @FXML
    private ImageView pic;
    @FXML
    private DatePicker date;

    /**
     * Initializes the Gallery Add view.
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
