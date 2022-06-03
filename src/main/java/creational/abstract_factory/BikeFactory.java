package creational.abstract_factory;

public class BikeFactory extends VehicleFactory {

    @Override
    public Vehicle create(VehicleSize size) {
        return switch (size) {
            case SMALL -> new MountainBike();
            case LARGE -> new CityBike();
        };
    }
}
