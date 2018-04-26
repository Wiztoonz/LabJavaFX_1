package com.lab.javafx.calculator.cos;


import com.lab.javafx.calculator.cos.massage.MassageWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;


public class CosController {

    @FXML
    private TextField number;
    @FXML
    private TextField cosNumber;

    @FXML
    private Button cos_btnn;

    @FXML
    private void cos_click() {
        if(cosNumber.getText().isEmpty() || number.getText().isEmpty() || Double.parseDouble(number.getText()) <= 0 || Double.parseDouble(number.getText()) >= 360 || Double.parseDouble(number.getText()) == 90) {
            cos_btnn.setOnAction(
                    event -> {
                        try {
                            MassageWindow.massage("Massage");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            );
            //cosNumber.setText("");
           // cosNumber.setText(cosNumber.getText() + "Cos != 90 & != < 0 & != > 360");
        } else {
            cosNumber.setText("");
            double value = Double.parseDouble(number.getText());
            value = Math.cos(value);
            cosNumber.setText(cosNumber.getText() + value);
        }
    }

    @FXML
    private void clear_click() {
        number.setText("");
        cosNumber.setText("");
    }
}
