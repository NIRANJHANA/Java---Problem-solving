package Interface;

public interface Interface_B {

    public void commonAbstratcMethod();

    void abstractMethod_B(); // public abstract - by default

    default void commonDefaultMethod(){
        System.out.println("Common default method inside interface_B");
    }

    default void defaultMethod_B(){
        System.out.println("Default method inside interface_B");
    }
}
