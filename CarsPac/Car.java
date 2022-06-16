package CarsPac;

public class Car {

    private String make;
    private String model;
    private int cc;
    private String colour;
    private int speed;

    public Car(String make, String model) {
        this(make, model, 0, "white");
    }

    public Car(String make, String model, int cc, String colour) {
        this.make = make;
        this.model = model;
        this.cc = cc;
        this.colour = colour;
    }

    public String showCar() {
        return String.format("car: make=%s, model=%s, cc=%d, colour=%s, speed=%d %n",
                getMake(), getModel(), getCc(), getColour(), getSpeed());
    }

    public String toString() {
        return getClass() + ": make = " + make +
                ", model = " + model +
                ", cc = " + cc +
                ", speed = " + speed;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public String getColour() {
        return colour;
    }
    public int getSpeed() {
        return speed;
    }
    

}
