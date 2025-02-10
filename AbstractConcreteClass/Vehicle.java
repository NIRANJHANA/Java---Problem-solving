package AbstractConcreteClass;

// abstract class -> can't create object
public abstract class Vehicle {
    // abstract method
    abstract void startEngine();

    // concrete method
    static void stopEngine(){
        System.out.println("Engine stopped in vehicle class");
    }
}
