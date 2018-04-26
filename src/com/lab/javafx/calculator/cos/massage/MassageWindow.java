package com.lab.javafx.calculator.cos.massage;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MassageWindow {

    public static void massage(String title) throws IOException {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(stage.getOwner());
        stage.setResizable(false);
        Parent root = FXMLLoader.load(MassageWindow.class.getResource("massageFXML.fxml"));
        Scene scene = new Scene(root, 600, 200);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

}
