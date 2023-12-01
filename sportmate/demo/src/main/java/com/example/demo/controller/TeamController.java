package com.example.demo.controller;

import com.example.demo.Util.FileUtilT;
import com.example.demo.HelloApplication;
import com.example.demo.Member;
import com.example.demo.Team;
import com.example.demo.edit.TeamEditController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;
/**
 * The 'TeamController' class is responsible for controlling the functionality of the Team view in the application.
 */
public class TeamController implements Controller{
    @FXML
    private TableView<Team> tableViewT;
    @FXML
    private TableColumn<Team, String> teamName;
    @FXML
    private TableColumn<Team, String> type;
    @FXML
    private TableColumn<Team, String> leader;
    @FXML
    private TableColumn<Team, String> memberList;
    /**
     * Initializes data to the TableView.
     */
    public void initialize(){
        getData();
    }
    /**
     * Retrieves and displays team data in the Team TableView.
     */
    private void getData(){
        List<Team> teams = FileUtilT.readData();
        teamName.setCellValueFactory(new PropertyValueFactory<>("teamName"));
        type.setCellValueFactory(new PropertyValueFactory<>("type"));
        leader.setCellValueFactory(new PropertyValueFactory<>("leader"));
        memberList.setCellValueFactory(new PropertyValueFactory<>("memberList"));

        tableViewT.setItems(FXCollections.observableList(teams));
    }
    /**
     * Shows the "Add Team" scene by calling the addT method from the HelloApplication class.
     */
    @FXML
    public void showAddT(){
        HelloApplication.addT("addT.fxml");
    }
    /**
     * Allows the user to open and edit the selected team from edit scene.
     */
    @FXML
    public void editTeam(){
        Team team = tableViewT.getSelectionModel().getSelectedItem();
        if (team != null){
            TeamEditController.edit(team);
            HelloApplication.addT("editT.fxml");
        }
    }
    /**
     * Deletes the selected team's data and refreshes the TableView.
     */
    @FXML
    public void deleteTeam(){
        Team team = tableViewT.getSelectionModel().getSelectedItem();
        if (team != null){
            FileUtilT.deleteData(team.getTeamName());
            getData();
        }
    }

    /**
     * Recruit a new Member.
     */
    @FXML
    public void recruitNewMember(){


    }
    /**
     * Updates data to the Team TableView.
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
    @Override
    public void goTeam() {

    }
    /**
     * Navigates to the "Event View" scene.
     */
    @FXML
    public void goEvent(){
        HelloApplication.changeStage("event-view.fxml");
    }
    /**
     * Navigates to the "Gallery View" scene.
     */
    @FXML
    public void goGallery(){
        HelloApplication.changeStage("gallery-view.fxml");
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
}
