package Overriding;

public class B extends A {
    @Override
    // co-variant return type
    public String m1(){
        System.out.println("class B");
        return null;
    }

    /* 
    // CE: Cannot reduce the visibility of the inherited method from A

    // access is reduced (protected - private)
    private String m1(){
        System.out.println("class B");
        return null;
    }

    // access is reduced (protected - default)
    String m1(){
        System.out.println("class B");
        return null;
    }
    */
}
