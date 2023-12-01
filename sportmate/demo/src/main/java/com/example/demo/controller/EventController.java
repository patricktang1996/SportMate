package com.example.demo.controller;

import com.example.demo.Util.FileUtilE;
import com.example.demo.Event;
import com.example.demo.edit.EventEditController;
import com.example.demo.HelloApplication;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;
/**
 * The 'EventController' class is responsible for controlling the functionality of the Event view in the application.
 */
public class EventController {
    @FXML
    private TableView<Event> tableViewE;
    @FXML
    private TableColumn<Event, String> eventName;
    @FXML
    private TableColumn<Event, String> eventType;
    @FXML
    private TableColumn<Event, String> time;
    @FXML
    private TableColumn<Event, String> loca;
    /**
     * Initializes data to the TableView.
     */
    public void initialize(){
        getData();
    }
    /**
     * Retrieves and displays Event data in the Event TableView.
     */
    private void getData(){
        List<Event> events = FileUtilE.readData();
        eventName.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventType.setCellValueFactory(new PropertyValueFactory<>("eventType"));
        time.setCellValueFactory(new PropertyValueFactory<>("time"));
        loca.setCellValueFactory(new PropertyValueFactory<>("loca"));

        tableViewE.setItems(FXCollections.observableList(events));
    }
    /**
     * Shows the "Add Event" scene by calling the addE method from the HelloApplication class.
     */
    @FXML
    public void showAddE(){
        HelloApplication.addE("addE.fxml");
    }
    /**
     * Allows the user to open and edit the selected Event from edit scene.
     */
    @FXML
    public void editEvent(){
        Event event = tableViewE.getSelectionModel().getSelectedItem();
        if (event != null){
            EventEditController.edit(event);
            HelloApplication.addE("editE.fxml");
        }
    }
    /**
     * Deletes the selected Event's data and refreshes the TableView.
     */
    @FXML
    public void deleteEvent(){
        Event event = tableViewE.getSelectionModel().getSelectedItem();
        if (event != null){
            FileUtilE.deleteData(event.getEventName());
            getData();
        }
    }
    /**
     * Updates data to the Event TableView.
     */
    @FXML
    public void refresh(){
        getData();
    }
    /**
     * Navigates to the "Member View" scene.
     */
    @FXML
    public void goMember(){
        HelloApplication.changeStage("member-view.fxml");
    }
    /**
     * Navigates to the "Team View" scene.
     */
    @FXML
    public void goTeam(){
        HelloApplication.changeStage("team-view.fxml");
    }
    /**
     * Navigates to the "Announcement View" scene.
     */
    @FXML
    public void goAnnouncement(){
        HelloApplication.changeStage("announcement-view.fxml");
    }
    /**
     * Navigates to the "login View" scene.
     */
    @FXML
    public void logout(){
        HelloApplication.changeStage("login.fxml");
    }
    /**
     * Navigates to the "Dashboard View" scene.
     */
    @FXML
    public void goDashboard(){
        HelloApplication.changeStage("dashboard-view.fxml");
    }
    /**
     * Navigates to the "Gallery View" scene.
     */
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
    }
}
