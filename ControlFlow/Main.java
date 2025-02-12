package ControlFlow;

public class Main {
    static {
        System.out.println("Main static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Child c = new Child(); // parent class and then child class is loaded after encounter child cls object then after that instance control flow starts
    }
}
