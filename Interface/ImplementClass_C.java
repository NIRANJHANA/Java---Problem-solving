package Interface;

public class ImplementClass_C implements Interface_C {
    public void commonAbstratcMethod(){
        System.out.println("Single implementation for common abstract method from both interfaces");
    }

    public void abstractMethod_A(){
        System.out.println("implementing abstractMethod_A of interface_A inside class");
    }

    public void abstractMethod_B(){
        System.out.println("implementing abstractMethod_B of interface_B inside class");
    }

    public void abstractMethod_C(){
        System.out.println("implementing abstratcMethod_C of interface_C inside class");
    }

    @Override
    public void commonDefaultMethod(){
        System.out.println("Overriding common default method inside class");
    }
}
