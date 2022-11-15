package com.paliashchuk.tms.javahometask7;

public enum MathematicalOperation {
    MULTIPLICATION("*"),
    DIVISION("/"),
    ADDITION("+"),
    SUBTRACTION("-");

    private String shortDescription;

    MathematicalOperation(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
