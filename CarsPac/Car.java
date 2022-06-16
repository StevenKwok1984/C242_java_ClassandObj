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

    public static void showCar(Car car) {
        System.out.printf("car: make=%s, model=%s, cc=%d, colour=%s, speed=%d")

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






}
