package CarsPac;

public class Engine {

    private final int cc;
    private final int numCylinders;
    private final String type; // V8, V6, Straight-4


    public Engine(String type, int numCylinders, int cc) {
        this.type = type;
        this.numCylinders = numCylinders;
        this.cc = cc;
    }


    public String getType() {
        return type + numCylinders;
    }

    public int getCc() {
        return cc;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public String toString() {
        return getClass() + " {" + type + ", numCylinders=" + numCylinders + ", cc=" + cc + "}";
    }

}
