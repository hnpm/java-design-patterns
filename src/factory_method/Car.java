package factory_method;

public class Car extends Vehicle {
    @Override
    public Car newInstance() {
        return new Car();
    }
}
