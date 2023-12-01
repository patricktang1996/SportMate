package com.example.demo.add;

import com.example.demo.Util.FileUtilT;
import com.example.demo.Team;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 * The 'TeamAddController' class is responsible for the function of adding a new team in the application.
 */
public class TeamAddController {
    @FXML
    private TextField name;
    @FXML
    private TextField type;
    @FXML
    private TextField leader;
    @FXML
    private TextField memberList;
    /**
     * Initializes the Team Add view.
     */
    @FXML
    public void initialize(){

    }
    /**
     * Connected to confirm button in the add scene, Adds a new team with the provided information to the data store.
     */
    @FXML
    public void addConfirm(){
    	
        Team team = new Team(name.getText(), type.getText(), leader.getText(), memberList.getText());
        FileUtilT.addData(team);
    }
}
