package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        // m1();
        // System.out.println(m2());
        m3();
    }

    @SuppressWarnings("unused")
    public static void m1(){
        try {
            System.out.println("try");
            int num = 20/0;
        }
        catch(Exception e){
            System.out.println("catch");
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }
    }

    @SuppressWarnings("unused")
    public static String m2(){
        try {
            int num = 10/0;
            return "try";
        }
        catch(Exception e){
            System.out.println(e);
            return "catch";
        }
        finally {
            System.out.println("finally block");
            // return "finally"; -> causes warning - should not use return, break, continue inside finally - it'll override try and catch return
        }
    }

    @SuppressWarnings("unused")
    // only scenario where finally block is not executed
    public static void m3(){
        try {
            System.out.println("try");
            int num  = 10/0;
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("catch");
            System.exit(0);
        }
        finally {
             System.out.println("finally");
        }
    }
}
