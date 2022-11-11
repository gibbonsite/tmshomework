package com.paliashchuk.tms.javahometask7;

import java.util.ArrayList;
import java.util.List;

public class ResultOperationHistoryUsingCollectionsImpl implements ResultOperationHistory {
    private List<CalculationResult> history = new ArrayList<>();

    @Override
    public void addResult(CalculationResult result) {
        history.add(result);
    }

    @Override
    public void printHistory() {
        System.out.println("Calculation result history:");
        int listIndex = 1;
        for (CalculationResult result : history) {
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
