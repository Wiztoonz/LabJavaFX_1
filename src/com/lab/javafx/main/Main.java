package com.lab.javafx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../main/main.fxml"));
        Scene scene = new Scene(root, 300, 171);
        scene.setCursor(Cursor.H_RESIZE);
        primaryStage.setTitle("Oleg Rosinskiy");
        primaryStage.getIcons().add(new Image( Main.class.getResourceAsStream( "./image/computer.png" )));
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(275);
        primaryStage.setMinWidth(300);
        primaryStage.setResizable(false);
        primaryStage.setIconified(true);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
