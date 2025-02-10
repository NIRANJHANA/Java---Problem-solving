package Interface;

public class ImplementClass_C implements Interface_C {
    public void commonAbstratcMethod(){
        System.out.println("Single implementation for common abstract method from both interfaces");
    }

    public void abstratcMethod_A(){
        System.out.println("implementing abstratcMethod_A of interface_A inside class");
    }

    public void abstratcMethod_B(){
        System.out.println("implementing abstratcMethod_B of interface_A inside class");
    }

    @Override
    public void commonDefaultMethod(){
        System.out.println("Overriding common default method inside class");
    }
}
