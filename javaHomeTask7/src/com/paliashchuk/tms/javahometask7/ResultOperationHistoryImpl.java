package com.paliashchuk.tms.javahometask7;

public class ResultOperationHistoryImpl implements ResultOperationHistory {
    private CalculationResult[] history = new CalculationResult[10];
    private int top;


    @Override
    public void addResult(MathematicalOperation operation, CalculationResult result) {
        history[top] = result;
        top = (top + 1) % history.length;
    }

    @Override
    public void printHistory() {
        System.out.println("Calculation result history:");
        int listIndex = 1;
        for (int i = 0; i < history.length; i++) {
            CalculationResult result = history[(top + i) % history.length];
            if (result == null) {
                continue;
            }
            if (!result.hasError()) {
                System.out.println((listIndex++) + ") " + result.getResult());
            } else {
                System.out.println((listIndex++) + ") Error occurred while calculating the result: "
                        + result.getErrorMessage());
            }
        }
        if (listIndex == 1) {
            System.out.println("(Empty)");
        }
    }
}
