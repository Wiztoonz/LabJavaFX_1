package com.lab.javafx.calculator.cos;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCosWindow {

    public static void cosWin(String title) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(stage.getOwner());
        Parent root = FXMLLoader.load(MainCosWindow.class.getResource("cosWindow.fxml"));
        Scene scene = new Scene(root, 466, 102);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

}
