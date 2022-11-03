package com.paliashchuk.tms.javahometask7;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void serve() {
        System.out.println("Welcome to Calculator!");
        while (true) {
            showMenu();
            int menuItem = getMenuItemIndex();
            if (menuItem == 1) {
                processMathematicalOperation();
            } else {
                break;
            }
        }
        System.out.println("Goodbye!");
    }

    private void showMenu() {
        System.out.println("Select item from the menu below:");
        System.out.println("1) Calculate mathematical operation");
        System.out.println("2) Quit");
    }

    private int getMenuItemIndex() {
        int menuItem;
        while (true) {
            menuItem = getInt();
            if (menuItem == 1 || menuItem == 2) {
                return menuItem;
            }
            System.out.println("Please, enter number 1 or 2.");
        }
    }

    private void processMathematicalOperation() {
        System.out.println("Enter first number:");
        double firstNumber = getDouble();
        System.out.println("Enter second number:");
        double secondNumber = getDouble();
        System.out.println("Enter mathematical operation (+, -, * or /):");
        String operation = getOperation();
        Calculator calculator = null;
        switch (operation) {
            case "+":
                calculator = new Addition();
                break;
            case "-":
                calculator = new Subtraction();
                break;
            case "*":
                calculator = new Multiplication();
                break;
            case "/":
                calculator = new Division();
                break;
        }
        CalculationResult result = calculator.action(firstNumber, secondNumber);
        if (!result.hasError()) {
            System.out.println("The result is " + result.getResult());
        } else {
            System.out.println("Error occurred while calculating the result: " + result.getErrorMessage());
        }
    }

    private double getDouble() {
        while (true) {
            if (scanner.hasNextDouble()){
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid input! Please, provide float value with double precision.");
                scanner.nextLine(); // skip the line with wrong user input
            }
        }
    }

    private int getInt() {
        while (true) {
            if (scanner.hasNextInt()){
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please, provide int value.");
                scanner.nextLine(); // skip the line with wrong user input
            }
        }
    }

    private String getOperation() {
        String operation;
        while (true) {
            if (scanner.hasNextLine()) {
                operation = scanner.nextLine();
                switch (operation) {
                    case "*":
                    case "/":
                    case "+":
                    case "-":
                        return operation;
                    default:
                        System.out.println("Invalid input! Please, enter * or /, or +, or -.");
                }
            } else {
                System.out.println("Invalid input! Please, enter * or /, or +, or -.");
            }
        }
    }
}
