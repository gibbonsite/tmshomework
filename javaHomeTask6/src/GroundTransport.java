public class GroundTransport extends Transport {
    private int numberOfWheels;
    private double fuelConsumption;

    public GroundTransport(String brand, String model, int power, int maxSpeed, int weight, int numberOfWheels,
                           double fuelConsumption) {
        super(brand, model, power, maxSpeed, weight);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
