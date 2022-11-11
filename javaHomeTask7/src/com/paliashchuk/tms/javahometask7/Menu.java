package com.paliashchuk.tms.javahometask7;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private ResultOperationHistory history = new ResultOperationHistoryUsingCollectionsImpl();

    public void serve() {
        System.out.println("Welcome to Calculator!");
        while (true) {
            showMenu();
            try {
                int menuItem = getMenuItemIndex();
                if (menuItem == 1) {
                    processMathematicalOperation();
                } else if (menuItem == 2) {
                    history.printHistory();
                } else {
                    break;
                }
            } catch (InvalidMenuChoiceException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Goodbye!");
    }

    private void showMenu() {
        System.out.println("Select item from the menu below:");
        System.out.println("1) Calculate mathematical operation");
        System.out.println("2) Show calculation result history");
        System.out.println("3) Quit");
    }

    private int getMenuItemIndex() throws InvalidMenuChoiceException {
        int menuItem = getInt();
        if (menuItem == 1 || menuItem == 2 || menuItem == 3) {
            return menuItem;
        } else {
            throw new InvalidMenuChoiceException("Invalid menu item! Expected 1, 2 or 3.");
        }
    }

    private void processMathematicalOperation() {
        System.out.println("Enter first number:");
        double firstNumber = getDouble();
        System.out.println("Enter second number:");
        double secondNumber = getDouble();
        scanner.nextLine();
        System.out.println("Enter mathematical operation (+, -, * or /):");
        MathematicalOperation operation;
        while (true) {
            try {
                operation = getOperation();
                break;
            } catch (InvalidMathematicalOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        Calculator calculator = null;
        switch (operation) {
            case ADDITION:
                calculator = new Addition();
                break;
            case SUBTRACTION:
                calculator = new Subtraction();
                break;
            case MULTIPLICATION:
                calculator = new Multiplication();
                break;
            case DIVISION:
                calculator = new Division();
                break;
        }
        CalculationResult result = calculator.action(firstNumber, secondNumber);
        if (!result.hasError()) {
            System.out.println("The result is " + result.getResult());
        } else {
            System.out.println("Error occurred while calculating the result: " + result.getErrorMessage());
        }
        history.addResult(result);
    }

    private double getDouble() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input! Please, provide float value with double precision.");
                scanner.nextLine(); // skip the line with wrong user input
            }
        }
    }

    private int getInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please, provide int value.");
                scanner.nextLine(); // skip the line with wrong user input
            }
        }
    }

    private MathematicalOperation getOperation() throws InvalidMathematicalOperationException {
        if (scanner.hasNextLine()) {
            String operation = scanner.nextLine();
            switch (operation) {
                case "*":
                    return MathematicalOperation.MULTIPLICATION;
                case "/":
                    return MathematicalOperation.DIVISION;
                case "+":
                    return MathematicalOperation.ADDITION;
                case "-":
                    return MathematicalOperation.SUBTRACTION;
                default:
                    throw new InvalidMathematicalOperationException("Invalid mathematical operation! "
                            + "Expected * or /, or +, or -.");
            }
        } else {
            throw new InvalidMathematicalOperationException("Please, provide mathematical operation! "
                    + "Expected * or /, or +, or -.");
        }
    }
}
