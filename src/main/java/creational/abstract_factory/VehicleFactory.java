package creational.abstract_factory;

import java.util.HashMap;
import java.util.Map;

public abstract class VehicleFactory {
    private static final Map<VehicleType, VehicleFactory> registry = new HashMap<>();
    public abstract Vehicle create(VehicleSize size);

    public static void register(VehicleType type, VehicleFactory factory) {
        registry.put(type, factory);
    }

    public static VehicleFactory getFactory(VehicleType type) {
        return registry.get(type);
    }
}
