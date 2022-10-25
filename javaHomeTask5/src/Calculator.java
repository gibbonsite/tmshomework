public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber;
    }

    public int divide() {
        return firstNumber / secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber;
    }
}
