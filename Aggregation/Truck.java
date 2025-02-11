package Aggregation;

public class Truck {
    Engine engine;
    GPS gps;

    Truck(Engine engine, GPS gps){
        this.engine = engine;
        this.gps = gps;
    }

    void start(){
        engine.start();
        System.out.println("Truck is moving...");
        gps.trackLocation();
    }
}
