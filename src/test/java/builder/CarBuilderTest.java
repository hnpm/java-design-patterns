package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarBuilderTest {
    @Test
    public void build() {
        var car = Car.builder()
                .color("red")
                .engine("BMW")
                .wheel("30x30")
                .build();
        assertEquals("red", car.getColor());
        assertEquals("BMW", car.getEngine());
        assertEquals("30x30", car.getWheel());
    }
}
