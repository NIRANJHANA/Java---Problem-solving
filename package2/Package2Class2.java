package package2;
import package1.*;

// this inheritance requires parent class "constructor" to be accessile -> alloweded modifiers: public, protected
public class Package2Class2 extends package1.Class1{
    public static void main(String[] args) {
        System.out.println("package2-class2-main");

        // protected method from parent class is accessible within the child class (both class is from different packages)
        Class1.method1(); 
    }
    
}
