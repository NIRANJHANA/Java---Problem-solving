package Interface;

public interface Interface_A {
    
    public abstract void commonAbstratcMethod();

    void abstratcMethod_A(); // public abstract - by default

    // can't override - static method belongs to interface
    static void staticMethod(){
        System.out.println("static method inside interface_A is calling private method inside Interface_A");
        privateMethod();
    }

    // can call or override
    default void defaultMethod_A(){
        System.out.println("Default method inside interface_A");
    }

    // must override
    default void commonDefaultMethod(){
        System.out.println("Common default method inside interface_A");
    }

    // access within interface
    // defined it as static only to access it directly from static method
    private static void privateMethod(){
        System.out.println("private method inside interface_A");
    }
}
