package com.lab.javafx.main;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextField text;

    @FXML
    private void ok_click() {
        text.setText(text.getText() + "!");
    }

    @FXML
    private void clear_click() {
        text.setText("");
    }

}
