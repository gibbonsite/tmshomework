public class AirTransport extends Transport {
    private int wingSpan;
    private int minimumRunwayLength;

    public AirTransport(String brand, String model, int power, int maxSpeed, int weight, int wingSpan, int minimumRunwayLength) {
        super(brand, model, power, maxSpeed, weight);
        this.wingSpan = wingSpan;
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }
}
