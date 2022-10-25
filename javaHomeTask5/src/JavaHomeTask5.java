public class JavaHomeTask5 {

    public static void main(String[] args) {
        // HomeTask 5.1
        {
            Calculator calculator = new Calculator(8, 5);
            System.out.println(calculator.add() == 13);
            System.out.println(calculator.subtract() == 3);
            System.out.println(calculator.multiply() == 40);
            System.out.println(calculator.divide() == 1);
        }

        // HomeTask 5.2
        {
            int maxOnOffCycles = 1000;
            Computer computer = new Computer("AMD Ryzen 5 5600H", 16, 512, maxOnOffCycles);
            computer.describe();
            for (int i = 0; i < maxOnOffCycles; i++) {
                computer.turnOn();
                computer.turnOff();
            }
        }
    }
}
