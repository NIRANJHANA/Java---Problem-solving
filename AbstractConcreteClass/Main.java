package AbstractConcreteClass;

public class Main {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine(); // will call reference class method

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine(); // will call reference class method

        Vehicle car2 = new Car();
        car2.startEngine();
        car2.stopEngine(); // method hiding
    }

}
