public class Main {
    public static void main(String[] args) {
        CarFactory factory = new ToyotaFactory();
        ICar car = factory.createCar();

        car.buildCar();
        car.paintCar();
        car.deliverCar();
    }
}