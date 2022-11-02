package com.paliashchuk.tms.javahometask7;

public class Addition implements Calculator {
    @Override
    public double action(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}
