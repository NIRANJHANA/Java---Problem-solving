package Aggregation;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();
        GPS gps = new GPS();
        Car car = new Car(engine, gps); // 
        
        car.start();

        Truck truck = new Truck(engine, gps);
        truck.start();
    }
}
