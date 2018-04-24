package com.lab.javafx.calculator;

import com.lab.javafx.calculator.cos.MainCosWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;


public class CalculatorController {


    @FXML
    private TextField promo;
    @FXML
    private TextField result;
    @FXML
    private Label actions;
    @FXML
    private Button cos_btn;


    private long firstNumber = 0;

    private boolean flag = false;

    private String operation = "";

    Numbers numbers = new Numbers();
    MainCosWindow mainCosWindow = new MainCosWindow();

    @FXML
    private void cos_click() {
        cos_btn.setOnAction(
                event ->  {
                    try {
                        MainCosWindow.cosWin("Cos");
                    } catch (IOException e) {
                        e.printStackTrace(); }
                }
        );
    }
    @FXML
    private void clear_click() {
        promo.setText("");
        result.setText("");
        actions.setText("");
        operation = "";
        firstNumber = 0;
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
            try {
                firstNumber = Long.parseLong(promo.getText());
            } catch (Exception e) {
                actions.setText("");
                actions.setText(actions.getText() + "Operation error click (C)");
                promo.setText("");
                result.setText("");
            }
            promo.setText("");
        } else {
            try {
                if (operation.isEmpty()) return;
                result.setText(String.valueOf(numbers.calcilatorNumbers(firstNumber, Long.parseLong(promo.getText()), operation)));
                actions.setText(firstNumber + operation + promo.getText() + value + result.getText());
                promo.setText("");
                operation = "";
                flag = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
