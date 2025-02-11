package Interface;

public class Main {
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();

        obj.commonAbstratcMethod();
        obj.abstractMethod_A();
        obj.abstractMethod_B();

        obj.commonDefaultMethod();
        obj.defaultMethod_A();
        obj.defaultMethod_B();

        // Access static field or method using interface name
        Interface_A.staticMethod();
        System.out.println("Value of static field in interface_A: " + Interface_A.CONSTANT);
    }
}
