package com.paliashchuk.tms.javahometask7;

public class Addition implements Calculator {
    @Override
    public CalculationResult action(double firstNumber, double secondNumber) {
        return new CalculationResult(firstNumber + secondNumber)   ;
    }
}
