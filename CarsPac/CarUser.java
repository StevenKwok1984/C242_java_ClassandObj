package CarsPac;

public class CarUser {
    public static void main(String[] args) {
        CarUser carUser = new CarUser();
        Car[] cars = carUser.createCars();
        carUser.showCars(cars);
    }

    public Car[] createCars() {
        Car car1 = new Car("VW", "Beetle", 1200, "pink");
        Car car2 = new Car("Merc", "C180", 2000, "grey");
        Car car3 = new Car("Ford", "Fiesta", 1600, "orange");

        Car car4 = new Car("Toyota", "Cololla");

        Car cars[] = new Car[] {car1, car2, car3, car4};
        return cars;
    }

    public void showCar(Car car) {

    }
}
