public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 250, 22000);
        Car volkswagen = new Car("Volkswagen", 240, 20000);
        Car ford = new Car("Ford", 220, 18000);

        Car[] cars = new Car[] {audi, volkswagen, ford};
        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].start();
            } catch (CarStartException e) {
                System.out.println("There was an error while starting: " + e.getMessage());
            }
        }
    }
}
