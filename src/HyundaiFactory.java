public class HyundaiFactory implements CarFactory{
    @Override
    public ICar createCar() {
        return new Hyundai();
    }
}
