public class JavaHomeTask6 {
    public static void main(String[] args) {
        PassengerTransport passengerTransport = new PassengerTransport("Audi", "A6 50 TDI quattro (C8)",
                286, 250, 1800, 4, 5.8d,
                PassengerTransportBodyType.SEDAN, 5);
        FreightTransport freightTransport = new FreightTransport("Scania","R420", 420, 90,
                18000, 8, 33.5d, 32);
        MilitaryTransport militaryTransport = new MilitaryTransport("Rockwell","B-1B Lancer", 161373,
                1328, 148200, 42, 3219, true,4);
        CivilTransport civilTransport = new CivilTransport("Boeing","737-800", 69237,
                876, 41400, 36, 2473, 189,
                false);

        System.out.println(passengerTransport);
        System.out.println(passengerTransport.getPathLengthAndFuelConsumptionByTime(2.5d));

        System.out.println(freightTransport);
        freightTransport.tryLoad(26);

        System.out.println(militaryTransport);
        for (int i = 0; i < 5; i++) {
            militaryTransport.shot();
        }

        System.out.println(civilTransport);
        civilTransport.tryAccommodate(80);
    }
}
