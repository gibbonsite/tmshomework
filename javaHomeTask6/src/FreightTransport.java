public class FreightTransport extends GroundTransport {
    private int loadCapacity;

    public FreightTransport(String brand, String model, int power, int maxSpeed, int weight, int numberOfWheels,
                            double fuelConsumption, int loadCapacity) {
        super(brand, model, power, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void tryLoad(int capacity) {
        if (capacity <= loadCapacity) {
            System.out.println("Truck has loaded.");
        } else {
            System.out.println("You need a bigger truck.");
        }
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "brand = " + getBrand() +
                ", model = " + getModel() +
                ", power (hp) = " + getPower() +
                ", power (kW) = " + getPowerInKiloWatts() +
                ", max speed (km/h) = " + getMaxSpeed() +
                ", weight (kg) = " + getWeight() +
                ", number of wheels = " + getNumberOfWheels() +
                ", fuel consumption (liters/100 km) = " + getFuelConsumption() +
                ", load capacity (tn) = " + loadCapacity +
                "}";
    }
}
