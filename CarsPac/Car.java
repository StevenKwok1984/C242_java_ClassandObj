package CarsPac;

public class Car {

    private final String make;
    private final String model;
    private Engine engine;
    private String colour;
    private int speed;

    public Car(String make, String model) {
        this(make, model, null, "white");
    }

    public Car(String make, String model, Engine engine, String colour) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }


    public String toString() {
        return getClass() + ": make = " + make +
                ", model = " + model +
                ", engine = " + engine +
                ", speed = " + speed;
    }



    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
    public int getSpeed() {
        return speed;
    }

    public String showCar() {
        return String.format("car: make=%s, model=%s, engine=%d, colour=%s, speed=%d %n",
                getMake(), getModel(), getEngine(), getColour(), getSpeed());
    }

}
