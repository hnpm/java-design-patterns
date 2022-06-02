package factory_method;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private final Map<VehicleType, Vehicle> registry = new HashMap<>();

    public void register(VehicleType type, Vehicle vehicle) {
        registry.put(type, vehicle);
    }

    public Vehicle create(VehicleType type) {
        return registry.get(type).newInstance();
    }
}
