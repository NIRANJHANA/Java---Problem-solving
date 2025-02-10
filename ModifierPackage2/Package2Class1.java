package ModifierPackage2;
import static ModifierPackage1.Class1.method3;

import ModifierPackage1.*;

public class Package2Class1 {
    public static void main(String[] args) {

        // import is not static so we seed to use Class name
        Class1.method2();

        // import is static so no need to use class name to access method
        method3(); // method3 from package1-Class1

        // protected method (method1 in package1) is accessible only within the package
        /* Class1.method1(); -> error: cannot find symbol
                                    Class1.method1();
                                symbol:   method method1()
                                location: class Class1 
        */ 

        // default class (Class3 from package1) is accessible only within the package
        /*  Class3.method1();  error: cannot find symbol
                                    Class3.method1();
                                symbol:   variable Class3
                                location: class Package2Class1
        */

        // Can't access default method outside the package
        /* Class2.defaultMethod(); error: cannot find symbol
                                        Class2.defaultMethod();
                                    symbol:   method defaultMethod()
                                    location: class Class2
        */

        // error: default_var is not public in Class1; cannot be accessed from outside package
        // System.out.println("Accessing default var outside the package: ", Class1.default_var); 
    }
}
