package package2;


// this inheritance requires parent class "constructor" to be accessile -> alloweded modifiers: public, protected
public class Package2Class2 extends package1.Class1{
    public static void main(String[] args) {
        System.out.println("package2-class2-main");

        // protected method from parent class is accessible within the child class (both class is from different packages)
        method1();

        // calls overridden method2 in current class
        method2();

        /*
        super.method2() // can't use super keyword within static area 
        */

        new Package2Class2().callParentMethod2();
    }

    void callParentMethod2(){
        super.method2();
    }
    
    // overrides method2() in parent class
    public static void method2(){
        System.out.println("package2-class2-method2");
    }
}
