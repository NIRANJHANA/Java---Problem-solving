package Interface;

public class ImplementClass implements Interface_A, Interface_B {

    public void commonAbstratcMethod(){
        System.out.println("Single implementation for common abstract method from both interfaces");
    }

    public void abstractMethod_A(){
        System.out.println("implementing abstractMethod_A of interface_A inside class");
    }

    public void abstractMethod_B(){
        System.out.println("implementing abstractMethod_B of interface_A inside class");
    }

    /*
    // if not overridden
    Error: Duplicate default methods named commonDefaultMethod with the parameters () and () 
    are inherited from the types Interface_B and Interface_AJ
    */

    /*
     * The default keyword in an interface does not mean "default access modifier." 
        Instead, it means that the method comes with a default implementation. 
        However, it is still "public" by default.
        So, when you override a default method in a class:
        * The overridden method in the class must explicitly have public visibility.
            ->if not public - Error: Cannot reduce the visibility of the inherited method from Interface
        * You cannot use the default keyword in a class because it's not valid there.
     */
    @Override
    public void commonDefaultMethod(){
        System.out.println("Overriding common default method inside class");
    }
}
