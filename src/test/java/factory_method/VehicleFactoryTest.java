package factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleFactoryTest {
    private final VehicleFactory factory = new VehicleFactory();

    @Test
    public void createBike() {
        var bike = factory.create(VehicleType.BIKE);
        assertTrue(bike instanceof Bike);
    }

    @Test
    public void createCar() {
        var car = factory.create(VehicleType.CAR);
        assertTrue(car instanceof Car);
    }

    @Test
    public void createTruck() {
        var truck = factory.create(VehicleType.TRUCK);
        assertTrue(truck instanceof Truck);
    }
}
