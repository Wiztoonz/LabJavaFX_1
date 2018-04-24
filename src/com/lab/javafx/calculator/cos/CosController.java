package com.lab.javafx.calculator.cos;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CosController {
    @FXML
    private TextField number;
    @FXML
    private TextField cosNumber;

    @FXML
    private void cos_click() {
        cosNumber.setText("");
        double value = Double.parseDouble(number.getText());
        value = Math.cos(value);
        cosNumber.setText(cosNumber.getText() + value);
    }

    @FXML
    private void clear_click() {
        number.setText("");
        cosNumber.setText("");
    }
}
