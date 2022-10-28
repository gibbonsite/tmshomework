import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int ram;
    private int hardDrive;
    private int maxOnOffCycles;
    private int numberOfTurnsOn;
    private boolean burnedDown;

    public Computer(String processor, int ram, int hardDrive, int maxOnOffCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.maxOnOffCycles = maxOnOffCycles;
    }

    public void describe() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard drive: " + hardDrive + " GB");
        System.out.println("Current number of on/off cycles: " + numberOfTurnsOn);
        System.out.println("Maximal number of on/off cycles: " + maxOnOffCycles);
        System.out.println("Is burned down: " + (numberOfTurnsOn > maxOnOffCycles || burnedDown));
    }

    public void turnOn() {
        if (numberOfTurnsOn <= maxOnOffCycles && !burnedDown) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 0 or 1: ");
            int userNumber = scanner.nextInt();
            Random random = new Random();
            if (userNumber == random.nextInt(2)) {
                numberOfTurnsOn++;
                System.out.println("The computer is turned on.");
            } else {
                burnedDown = true;
                System.out.println("You didn't guess the number. The computer is burned down.");
            }
        } else {
            System.out.println("Cannot turn on the computer, because it is burned down.");
        }
    }

    public void turnOff() {
        if (numberOfTurnsOn <= maxOnOffCycles && !burnedDown) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 0 or 1: ");
            int userNumber = scanner.nextInt();
            Random random = new Random();
            if (userNumber == random.nextInt(2)) {
                System.out.println("The computer is turned off.");
            } else {
                burnedDown = true;
                System.out.println("You didn't guess the number. The computer is burned down.");
            }
        } else {
            System.out.println("Cannot turn off the computer, because it is burned down.");
        }
    }
}
