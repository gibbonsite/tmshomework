package com.paliashchuk.tms.javahometask7;

public interface ResultOperationHistory {
    void addResult(MathematicalOperation operation, CalculationResult result);
    void printHistory();
}
