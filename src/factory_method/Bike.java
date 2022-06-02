package factory_method;

public class Bike extends Vehicle {
    @Override
    public Bike newInstance() {
        return new Bike();
    }
}
