package creational.singleton;

import creational.singleton.Singleton;
import creational.singleton.StaticSingleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonTest {
    @Test
    public void singleton() {
        var instance1 = Singleton.getInstance();
        var instance2 = Singleton.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void staticSingleton() {
        var instance1 = StaticSingleton.getInstance();
        var instance2 = StaticSingleton.getInstance();
        assertSame(instance1, instance2);
    }
}
