package AbstractConcreteClass;

// concrete class
public class Car extends Vehicle {

    // implementing abstract method
    void startEngine(){
        System.out.println("car engine starting...");
    }

    // @Override -> error: static methods cannot be annotated with @Override
    // Method hiding
    static void stopEngine(){
        System.out.println("car engine stopped in car class");
    }

    // The abstract method can only be defined by an abstract class
    // abstract void method();
}
