package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *The 'HelloApplication' class is the main entry point for the application, it displays the primary scene and offer methods to change to different scenes.
 */

public class HelloApplication extends Application {
    private static Stage stage;

    /**
     * The entry point and initial stage for the application. It displays the login scene.
     * @param stage The primary stage of the application.
     * @throws IOException throws an error when initialize the scene.
     */
    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        stage.setTitle("SportM!");
        changeStage("login.fxml");
        stage.show();

        stage.setResizable(false);

        //stage.setScene(scene);

    }

    /**
     * Change the current scene to new scene by loading FXML file.
     * @param fxml The FXMl file the stage is going to display.
     */
    public static void changeStage(String fxml){
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Loading FXML file, and open a new stage to add a member.
     * @param fxml The FXML file for new scene.
     */
    public static void addM(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
    /**
     * Loading FXML file, and open a new stage to add a team.
     * @param fxml The FXML file for new scene.
     */
    public static void addT(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
    /**
     * Loading FXML file, and open a new stage to add an event.
     * @param fxml The FXML file for new scene.
     */
    public static void addE(String fxml){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxml));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    /**
     * Loading FXML file, and open a new stage to add a gallery.
     * @param fxml The FXML file for new scene.
     */
    public static void addG(String fxml){

    }

    /**
     * Loading FXML file, and open a new stage to add an announcement.
     * @param fxml The FXML file for new scene.
     */
    public static void addA(String fxml){

    }


    public static void main(String[] args) {
        launch();
    }
}