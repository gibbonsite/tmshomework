package com.paliashchuk.tms.javahometask7;

public class CalculationResult {
    private double result;
    private String errorMessage;

    public CalculationResult(double result, String errorMessage) {
        this.result = result;
        this.errorMessage = errorMessage;
    }

    public CalculationResult(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public CalculationResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean hasError() {
        return errorMessage != null;
    }
}
