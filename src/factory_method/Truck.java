package factory_method;

public class Truck extends Vehicle {
    @Override
    public Truck newInstance() {
        return new Truck();
    }
}
