public class Toyota implements ICar{

    @Override
    public void buildCar() {
        System.out.println("Building car...");
    }

    @Override
    public void paintCar() {
        System.out.println("Painting car...");
    }

    @Override
    public void deliverCar() {
        System.out.println("Delivering car...");
    }
}
