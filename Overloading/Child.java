package Overloading;

public class Child extends Parent {
    void m6(float num){
        System.out.println("child-float");
    }

    void m7(int a){
        System.out.println("m7 -> child");
    }
}
