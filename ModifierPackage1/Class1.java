package ModifierPackage1;

public class Class1 {

    protected Class1(){
            System.out.println("Class1 constructor -> protected");
    }

    protected static int protected_var = 5;
    static int default_var = 10;

    public static void main(String[] args) {

        System.out.println("package1-cls1-main");
        // accessing default var within class
        System.out.println("default var within class: " + default_var);

        Class3.method1(); // accessing default class within package
        // method1();
        // Class2.method1();
    }

    protected static void method1(){
        System.out.println("package1-class1-method1->protected");
        System.out.println("value of protected var within class1: " + protected_var);
    }

    public static void method2(){
        System.out.println("package1-class1-method2");
    }

    public static void method3(){
        System.out.println("package1-class1-method3");
    }
}
