package AbstractConcreteClass;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();

        Vehicle car2 = new Car();
        car2.startEngine();
        car2.stopEngine(); // method hiding
    }

}
