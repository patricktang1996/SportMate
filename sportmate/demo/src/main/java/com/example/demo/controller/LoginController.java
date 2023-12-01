package com.example.demo.controller;

import com.example.demo.HelloApplication;
import com.example.demo.Util.StringUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * The 'LoginController' class is the entry of a JavaFX application called "SportMate".
 * The class provides method to allow users to input account and password to access the content of the application.
 * @version 1.0
 * @since 17.0
 */
public class LoginController {
    @FXML
	public TextField account;
    @FXML
	public TextField password;
    @FXML
	public Label error;
       


	/**
     * The method is called when related FXML file is initialized.
     */
    @FXML
    public void initialize(){

    }

    /**
     * This method is called when user tries to use account and password to log in, it performs the log in action or display error messages.
     */
    @FXML
    public void login(){
    	String acc = account.getText();
    	String pass = password.getText();
    	this.loginCheckFX(acc, pass);
    }
    
    public void loginCheckFX(String acc, String pass) {
        if (StringUtil.isEmpty(acc)){
            error.setText("Acc cannot be empty.");
            error.setVisible(true);
            return;
        }
        if (StringUtil.isEmpty(pass)){
            error.setText("Password cannot be empty.");
            error.setVisible(true);
            return;
        }
        if (checkAccAndPass(acc, pass)){
            HelloApplication.changeStage("dashboard-view.fxml");
        }else {
            error.setText("Wrong acc/password.");
            error.setVisible(true);
        }
    }
    
    public boolean checkAccAndPass(String acc, String pass) {
    	return (acc.equals("123") && pass.equals("123"));
    }
        
}
