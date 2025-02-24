package ExceptionHandling;

public class Test1 {
    public static void main(String[] args) {
        // Single catch
        try {
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(ArithmeticException e) {
            System.out.println("catch");
        }

        // Multiple catch
        try {
            System.out.println("try");
            System.out.println(10/0);
        }
        catch(NullPointerException e) {
            System.out.println("catch-1");
        }
        catch(ArithmeticException e) {
            System.out.println("catch-2");
        }

        // In Multiple catch blocks - the order should not be parent, child
    /*
        try {
            System.out.println(10/0);
        }
        catch(Exception e) {

        }
        catch(ArithmeticException e) {
            // Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
        }
    */


    }
}
