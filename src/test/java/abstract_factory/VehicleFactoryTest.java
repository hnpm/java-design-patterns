package abstract_factory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleFactoryTest {

    @BeforeAll
    static void setup() {
        VehicleFactory.register(VehicleType.BIKE, new BikeFactory());
        VehicleFactory.register(VehicleType.CAR, new CarFactory());
    }

    @Test
    public void createMountainBike() {
        var bike = VehicleFactory.getFactory(VehicleType.BIKE).create(VehicleSize.SMALL);
        assertTrue(bike instanceof MountainBike);
    }

    @Test
    public void createCityBike() {
        var bike = VehicleFactory.getFactory(VehicleType.BIKE).create(VehicleSize.LARGE);
        assertTrue(bike instanceof CityBike);
    }

    @Test
    public void createSportCar() {
        var car = VehicleFactory.getFactory(VehicleType.CAR).create(VehicleSize.SMALL);
        assertTrue(car instanceof SportCar);
    }

    @Test
    public void createSedanCar() {
        var car = VehicleFactory.getFactory(VehicleType.CAR).create(VehicleSize.LARGE);
        assertTrue(car instanceof Sedan);
    }
}
