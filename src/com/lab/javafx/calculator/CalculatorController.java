package com.lab.javafx.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class CalculatorController {

    @FXML
    private TextField promo;
    @FXML
    private TextField result;
    @FXML
    private Label actions;


    private long firstNumber = 0;

    private boolean flag = false;

    private String operation = "";

    Numbers numbers = new Numbers();

    @FXML
    private void clear_click() {
        promo.setText("");
        result.setText("");
        actions.setText("");
    }
    @FXML
    private void number_click(ActionEvent event) {
        if (flag) {
            promo.setText("");
            flag = false;
        }
        String value = ((Button)event.getSource()).getText();
        promo.setText(promo.getText() + value);
    }
    @FXML
    private void operation_click(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value)) {
            if(!operation.isEmpty()) return;
            operation = value;
            firstNumber = Long.parseLong(promo.getText());
            promo.setText("");
        } else {
            if (operation.isEmpty()) return;
                result.setText(String.valueOf(numbers.calcilatorNumbers(firstNumber,Long.parseLong(promo.getText()),operation)));
                actions.setText(firstNumber + operation + promo.getText() + value + result.getText());
                promo.setText("");
                operation = "";
                flag = true;
        }
    }

}
