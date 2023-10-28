public class ToyotaFactory implements CarFactory{
    @Override
    public ICar createCar() {
        return new Toyota();
    }
}
