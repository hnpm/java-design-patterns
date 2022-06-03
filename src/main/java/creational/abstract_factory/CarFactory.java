package creational.abstract_factory;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle create(VehicleSize size) {
        return switch (size) {
            case SMALL -> new SportCar();
            case LARGE ->  new Sedan();
        };
    }
}
