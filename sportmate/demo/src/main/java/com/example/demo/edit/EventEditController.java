package com.example.demo.edit;

import com.example.demo.Util.FileUtilE;
import com.example.demo.Event;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
/**
 * The 'EventEditController' class is responsible for functioning the edit an Event's information in the app.
 */
public class EventEditController implements Edit{
    @FXML
    private TextField eventName;
    @FXML
    private TextField eventType;
    @FXML
    private DatePicker time;
    @FXML
    private TextField loca;

    private static Event selected;
    /**
     * Sets the team to be edited. This method is called before initializing the view to pass the selected Event's information.
     *
     * @param selected The Event object to be edited.
     */
    public static void edit(Event selected){
        EventEditController.selected = selected;
    }
    /**
     * Initializes the Event Edit view, filling selected Event info to the input fields.
     */
    @FXML
    public void initialize(){
        eventName.setText(selected.getEventName());
        eventType.setText(selected.getEventType());
        time.getEditor().setText(selected.getTime());
        loca.setText(selected.getLoca());
    }
    /**
     * Confirms the edited info and add to data.
     */
    @FXML
    public void editConfirm(){
        Event event = new Event(eventName.getText(), eventType.getText(), time.getEditor().getText(), loca.getText());
        FileUtilE.editData(event);
    }
}
