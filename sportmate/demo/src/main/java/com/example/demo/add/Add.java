package com.example.demo.add;

import javafx.fxml.FXML;
/**
 * The 'Add' interface provides a contract for classes that handle the addition of items in the application.
 */
public interface Add {
    /**
     * Initializes the add item functionality.
     */
    public void initialize();
    /**
     * Confirms and adds the item to the application.
     */
    @FXML
    public void addConfirm();
}
