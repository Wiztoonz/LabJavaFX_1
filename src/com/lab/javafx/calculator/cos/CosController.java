package com.lab.javafx.calculator.cos;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class CosController {

    @FXML
    private TableView<CosController> mainTable;
    @FXML
    private TableColumn tableNumber;
    @FXML
    private TableColumn tableCosNumber;

    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;


    @FXML
    protected void cos_click() {
        ObservableList<CosController> nums = mainTable.getItems();
        for(int i = 0; i < Integer.parseInt(firstNumber.getText()); i++) {
            nums.add(new CosController()); // добавляем строку
        }
    }

    }

}
