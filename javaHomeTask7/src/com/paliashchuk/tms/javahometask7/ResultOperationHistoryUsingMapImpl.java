package com.paliashchuk.tms.javahometask7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResultOperationHistoryUsingMapImpl implements ResultOperationHistory {
    private HashMap<MathematicalOperation, List<CalculationResult>> history = new HashMap<>();

    @Override
    public void addResult(MathematicalOperation operation, CalculationResult result) {
        history.putIfAbsent(operation, new ArrayList<>());
        history.get(operation).
                add(result);
    }

    @Override
    public void printHistory() {
        for (MathematicalOperation operation : MathematicalOperation.values()) {
            System.out.println("History of " + operation.getShortDescription() + " operations:");
            int listIndex = 1;
            for (CalculationResult result : history.getOrDefault(operation, new ArrayList<>())) {
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
}
