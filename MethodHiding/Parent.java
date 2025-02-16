package MethodHiding;

public class Parent {
    
    // can't override / hide this main method in child class
    public static final void main(String[] args) {
        System.out.println("Parent Main");
    }

    public static void m1(){
        System.out.println("m1");
    }

    public static final void m2(){
        System.out.println("m2");
    }
}
