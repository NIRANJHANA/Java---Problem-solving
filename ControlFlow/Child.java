package ControlFlow;

public class Child extends Parent {
    // static block
    static {
        System.out.println("Child static block");
    }

    // instance block
    {
        System.out.println("Child instance block");
    }

    // constructor
    Child() {
        System.out.println("Child constructor");
    }
}
