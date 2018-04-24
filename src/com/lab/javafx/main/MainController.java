package com.lab.javafx.main;


import com.lab.javafx.calculator.CalcWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;


public class MainController {

    @FXML
    private TextField text;
    public Button calc_button;

    @FXML
    private void ok_click() { text.setText(text.getText() + "!"); }

    @FXML
    private void clear_click() {
        text.setText("");
    }

    @FXML
    private void calc_click() {
        calc_button.setOnAction(
            event ->  {
                try {
                    CalcWindow.Win("Calculator");
                } catch (IOException e) {
                    e.printStackTrace(); }
            }
        );
    }

}
