import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int cost;

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public void start() throws CarStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 1) {
            System.out.println(getDescription() + " started.");
        } else {
            throw new CarStartException(getDescription() + " couldn't start.");
        }
    }

    private String getDescription() {
        return "Car " + brand + " with maximal speed " + speed + " km/h and cost $" + cost;
    }
}
