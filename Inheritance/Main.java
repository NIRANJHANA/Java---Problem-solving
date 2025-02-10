package Inheritance;

public class Main {
    public static void main(String[] args) {
        IronMan tony = new IronMan("Tony Stark", "tech genuis");
        tony.usePower();
        tony.fly();

        SpiderMan peter = new SpiderMan("Peter Parker", "web-slinging");
        peter.usePower();
        peter.character();

        MikesMorales miles = new MikesMorales("Miles Morales", "web-slinging");
        miles.usePower();
        miles.climbWall();
        miles.character();

        // Upcasting: Parent reference to child object.
        SpiderMan parentObj = new MikesMorales("peter-miles", "web");
        parentObj.climbWall();
        parentObj.character(); // Executes the child's overridden method
        parentObj.petersMethod();
        // can't access child specific method with parent reference even it is a child object
        // parentObj.milesMethod(); CE: cannot find symbol

        // Downcasting: Explicitly casting parent reference back to the child type
        // instanceof should be used to avoid runtime exceptions
        if(parentObj instanceof MikesMorales){
            MikesMorales childObj = (MikesMorales) parentObj;
            childObj.milesMethod();
        }


        // child reference - parent obj not allowed -> error: incompatible types: SpiderMan cannot be converted to MikesMorales
        // MikesMorales childObj = new SpiderMan("name", "power");



        // Multiple inheritance
        MultipleInheritance obj = new MultipleInheritance();

        System.out.println("'MULTIPLE INHERITANCE USING INTERFACE'");
        obj.commonAbstratcMethod();
        obj.abstratcMethod_A();
        obj.abstratcMethod_B();

        obj.commonDefaultMethod();
        obj.defaultMethod_A();
        obj.defaultMethod_B();

        // Access static field or method using interface name
        Interface_A.staticMethod();
        System.out.println("Value of static field in interface_A: " + Interface_A.CONSTANT);
    }
}


/*
 Single Inheritance => SpiderMan->MilesMorales
 Multilevel => SuperHero->SpiderMan->MilesMorales
 Heirarchial=> SuperHero->IronMan, SpiderMan
*/