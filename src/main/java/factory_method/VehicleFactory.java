package factory_method;

public class VehicleFactory {
    public Vehicle create(VehicleType type) {
        return switch (type) {
            case BIKE -> new Bike();
            case CAR -> new Car();
            case TRUCK -> new Truck();
        };
    }
}
