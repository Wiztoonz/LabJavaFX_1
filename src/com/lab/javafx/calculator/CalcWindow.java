package com.lab.javafx.calculator;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class CalcWindow {

        public static void Win(String title) throws IOException {
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(stage.getOwner());
            Parent root = FXMLLoader.load(CalcWindow.class.getResource("calculatorWindow.fxml"));
            Scene scene = new Scene(root, 600, 400);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        }

}
