package Constructors;

public class Main {
    int a;
    Main() {
        System.out.println("no-args conctructor");
        this.a=5;
        this(this.a);
    }

    Main(int num) {
        System.out.println("1-arg conctructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new Main();
    }
}
