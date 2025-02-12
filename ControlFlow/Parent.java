package ControlFlow;

public class Parent {
    // static block
    static {
        System.out.println("parent static block");
    }

    // instance block
    {
        System.out.println("Parent instance block");
    }

    // constructor
    Parent() {
        System.out.println("Parent constructor");
    }
}
