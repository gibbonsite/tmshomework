public class Transport {
    private String brand;
    private String model;
    private int power;
    private int maxSpeed;
    private int weight;

    public Transport(String brand, String model, int power, int maxSpeed, int weight) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getPowerInKiloWatts() {
        return 0.74 * getPower();

    }

}
