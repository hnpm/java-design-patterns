package singleton;

public class StaticSingleton {
    private static final StaticSingleton instance = new StaticSingleton();

    private StaticSingleton() {}

    public static synchronized StaticSingleton getInstance() {
        return instance;
    }
}
