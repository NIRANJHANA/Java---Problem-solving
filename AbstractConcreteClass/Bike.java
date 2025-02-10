package AbstractConcreteClass;

public class Bike extends Vehicle {

    // must implement abstract method of parent class, O/W -> CE
    void startEngine(){
        System.out.println("Bike engine is starting...");
    }
}
