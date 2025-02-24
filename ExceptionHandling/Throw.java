package ExceptionHandling;

public class Throw {
    public static void main(String[] args) throws Exception {

        // throw new ArithmeticException("msg passed"); // unchecked - not necessary to handle

        // throw new Exception(); // checked - necessary to handle, o/w -> CE: Unhandled exception type Exception

        // throw new Error(); // RTE: 

        // CE: Unreachable code - can't write any statements after write
        // System.out.println("hi");
    }
}
