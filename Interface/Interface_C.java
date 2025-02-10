package Interface;

public interface Interface_C extends Interface_A, Interface_B {
    
    @Override
    default void commonDefaultMethod() {
        Interface_A.super.commonDefaultMethod(); // Call the method from Interface_A
        // or
        // Interface_B.super.commonDefaultMethod(); // Call the method from Interface_B
    }
}
