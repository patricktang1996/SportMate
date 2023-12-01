package com.example.demo.edit;

import com.example.demo.Util.FileUtilT;
import com.example.demo.Team;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 * The 'TeamEditController' class is responsible for functioning the edit a Team's information in the app.
 */
public class TeamEditController {
    @FXML
    private TextField teamName;
    @FXML
    private TextField type;
    @FXML
    private TextField leader;
    @FXML
    private TextField memberList;

    private static Team selected;
    /**
     * Sets the team to be edited. This method is called before initializing the view to pass the selected team's information.
     *
     * @param selected The Team object to be edited.
     */
    public static void edit(Team selected){
        TeamEditController.selected = selected;
    }
    /**
     * Initializes the Team Edit view, filling selected team info to the input fields.
     */
    @FXML
    public void initialize(){
        teamName.setText(selected.getTeamName());
        type.setText(selected.getType());
        leader.setText(selected.getLeader());
        memberList.setText(selected.getMemberList());
    }
    /**
     * Confirms the edited info and add to data.
     */
    @FXML
    public void editConfirm(){
        Team team = new Team(teamName.getText(), type.getText(), leader.getText(), memberList.getText());
        FileUtilT.editData(team);
    }
}
