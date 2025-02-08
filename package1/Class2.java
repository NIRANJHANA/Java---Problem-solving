package package1;

public class Class2 {

    public static void method1(){
        System.out.println("package1-class2-method1");
        // Accessing protected method within package outside the class
        Class1.method1();
        System.out.println("value of protected var from class-2: " + Class1.protected_var);
    }

    static void defaultMethod(){
        System.out.println("Defalt method within package1 class1");
    }
}
