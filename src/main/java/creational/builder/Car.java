package creational.builder;

public class Car {
    private String color;
    private String engine;
    private String wheel;

    public Car(Builder builder) {
        this.color = builder.color;
        this.engine = builder.engine;
        this.wheel = builder.wheel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheel() {
        return wheel;
    }

    public static class Builder {
        private String color;
        private String engine;
        private String wheel;

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder wheel(String wheel) {
            this.wheel = wheel;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
