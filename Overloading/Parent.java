package Overloading;

public class Parent {
    void m6(int num){
        System.out.println("parent-int");
    }

    void m7(int... a){
        System.out.println("m7 -> parent");
    }
}
