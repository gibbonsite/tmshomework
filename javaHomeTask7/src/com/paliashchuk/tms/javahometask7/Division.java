package com.paliashchuk.tms.javahometask7;

public class Division implements Calculator {
    @Override
    public CalculationResult action(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            return new CalculationResult("Division by zero.");
        }
        return new CalculationResult(firstNumber / secondNumber);
    }
}
