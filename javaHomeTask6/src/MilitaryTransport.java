public class MilitaryTransport extends AirTransport {
    private boolean presenceOfEjectionSystem;
    private int numberOfMissiles;

    public MilitaryTransport(String brand, String model, int power, int maxSpeed, int weight, int wingSpan,
                             int minimumRunwayLength, boolean hasEjectionSystem, int numberOfMissiles) {
        super(brand, model, power, maxSpeed, weight, wingSpan, minimumRunwayLength);
        this.presenceOfEjectionSystem = hasEjectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean hasEjectionSystem() {
        return presenceOfEjectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void shot() {
        if (numberOfMissiles != 0) {
            System.out.println("The rocket took off...");
            numberOfMissiles--;
        } else {
            System.out.println("No ammo");
        }
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "brand = " + getBrand() +
                ", model = " + getModel() +
                ", power (hp) = " + getPower() +
                ", power (kW) = " + getPowerInKiloWatts() +
                ", max speed (km/h) = " + getMaxSpeed() +
                ", weight (kg) = " + getWeight() +
                ", wing span (m) = " + getWingSpan() +
                ", minimum runway length (m) = " + getMinimumRunwayLength() +
                ", presence of ejection system = " + presenceOfEjectionSystem +
                ", number of missiles = " + numberOfMissiles +
                "}";
    }

}
