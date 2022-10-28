public class PassengerTransport extends GroundTransport {
    private PassengerTransportBodyType bodyType;
    private int numberOfPassengers;

    public PassengerTransport(String brand, String model, int power, int maxSpeed, int weight, int numberOfWheels,
                              double fuelConsumption, PassengerTransportBodyType bodyType, int numberOfPassengers) {
        super(brand, model, power, maxSpeed, weight, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public PassengerTransportBodyType getBodyType() {
        return bodyType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getPathLengthAndFuelConsumptionByTime(double time) {
        double pathLength = time * getMaxSpeed();
        double fuelConsumption = calculateFuelConsumptionByPath(pathLength);
        return "During the time " + time + " h, vehicle " + getBrand()
                + " moving at maximum speed " + getMaxSpeed() + " km/h"
                + " travels " + pathLength + " km and consumes " + fuelConsumption
                + " liters of fuel.";
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "brand = " + getBrand() +
                ", model = " + getModel() +
                ", power (hp) = " + getPower() +
                ", power (kW) = " + getPowerInKiloWatts() +
                ", max speed (km/h) = " + getMaxSpeed() +
                ", weight (kg) = " + getWeight() +
                ", number of wheels = " + getNumberOfWheels() +
                ", fuel consumption (liters/100 km) = " + getFuelConsumption() +
                ", body type = " + bodyType +
                ", number of passengers = " + numberOfPassengers +
                "}";
    }

    private double calculateFuelConsumptionByPath(double pathLength) {
        return getFuelConsumption() * (pathLength / 100);
    }
}
