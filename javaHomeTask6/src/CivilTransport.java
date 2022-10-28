public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean presenceOfBusinessClass;

    public CivilTransport(String brand, String model, int power, int maxSpeed, int weight, int wingSpan,
                          int minimumRunwayLength, int numberOfPassengers, boolean presenceOfBusinessClass) {
        super(brand, model, power, maxSpeed, weight, wingSpan, minimumRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.presenceOfBusinessClass = presenceOfBusinessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean hasBusinessClass() {
        return presenceOfBusinessClass;
    }

    public void tryAccommodate(int passengers) {
        if (passengers <= numberOfPassengers) {
            System.out.println("The plane is full.");
        } else {
            System.out.println("You need a bigger plane.");
        }
    }

    @Override
    public String toString() {
        return "CivilTransport{" +
                "brand = " + getBrand() +
                ", model = " + getModel() +
                ", power (hp) = " + getPower() +
                ", power (kW) = " + getPowerInKiloWatts() +
                ", max speed (km/h) = " + getMaxSpeed() +
                ", weight (kg) = " + getWeight() +
                ", wing span (m) = " + getWingSpan() +
                ", minimum runway length = " + getMinimumRunwayLength() +
                ", number of passengers = " + numberOfPassengers +
                ", presence of business class = " + presenceOfBusinessClass +
                "}";
    }
}

