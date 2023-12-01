package com.example.demo.add;

import com.example.demo.Util.FileUtilE;
import com.example.demo.Event;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
/**
 * The 'EventAddController' class is responsible for the function of adding a new Event in the app.
 */
public class EventAddController implements Add {
    @FXML
    private TextField eventName;
    @FXML
    private TextField eventType;
    @FXML
    private DatePicker time;
    @FXML
    private TextField loca;
    /**
     * Initializes the Event Add view.
     */
    @FXML
    public void initialize(){

    }
    /**
     * Connected to confirm button in the add scene, Adds a new team with the provided information to the data store.
     */
    @FXML
    public void addConfirm(){
        Event event = new Event(eventName.getText(), eventType.getText(), time.getEditor().getText(), loca.getText());
        FileUtilE.addData(event);
    }
}
