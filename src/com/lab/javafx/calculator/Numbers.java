package com.lab.javafx.calculator;


import static sun.misc.MessageUtils.out;


public class Numbers {
    public long calcilatorNumbers(long firstNumber, long secondNumber, String operation) {

            switch (operation) {
                case "+":
                    return  firstNumber + secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "/":
                    if(secondNumber == 0) {
                        return 0;
                    } else {
                        out("Unknown operator" + operation);
                    }
                    return firstNumber / secondNumber;
            }
        return 0;
    }
}
