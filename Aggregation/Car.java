package Aggregation;

public class Car {
    Engine engine;
    GPS gps;

    Car(Engine engine, GPS gps){
        this.engine = engine;
        this.gps = gps;
    }

    void start(){
        engine.start();
        System.out.println("Car is moving...");
        gps.trackLocation();
    }
    
}
