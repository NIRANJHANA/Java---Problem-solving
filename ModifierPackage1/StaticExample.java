package ModifierPackage1;

public class StaticExample {
    static int count = 0; // static variable
    int id; // instance variable

    public StaticExample(){
        id = ++count;
    }

    // instance method
    public void displayId(){
        System.out.println("ObjectId: " + id);
    }

    public static void displayCount(){
        System.out.println("Total objects created: " + count);
    }

    private static class InnerStaticExample {
        void show(){
            System.out.println("Inside inner static class");
        }
    }

    // static block
    static{
        System.out.println("inside static block");
    }


    public static void main(String[] args) {

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.displayId();
        obj2.displayId();

        displayCount();

        // inner class is static -> so accessing it without parentobj
        InnerStaticExample obj = new InnerStaticExample();
        obj.show();

        // if inner class is non-static -> parent obj is required
    /*  StaticExample parentObj = new StaticExample();
        InnerStaticExample childObj = parentObj.new InnerStaticExample();
    */

    }
}
