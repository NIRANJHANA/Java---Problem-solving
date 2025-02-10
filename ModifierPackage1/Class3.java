package ModifierPackage1;

class Class3 {
    public static void method1(){
        System.out.println("package1-cls3-method1 -> default class");
        System.out.println("default var within package from another class: " + Class1.default_var);
    }
}
