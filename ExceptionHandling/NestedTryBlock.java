package ExceptionHandling;

// import java.io.FileNotFoundException;
@SuppressWarnings("unused")
public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int b = 10/0;
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                    System.out.println("handled in inner block - 2");
                }
            }
            catch(ClassCastException e) {
                System.out.println(e);
                System.out.println("handled in inner block - 1");
            }
                // can't use FNFE - bcoz there is no code related to file handling
            /*  catch(FileNotFoundException e){
                    System.out.println(e);
                    System.out.println("handled in inner block - 1");
                }
            */
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("handled in outer block");
        }
    }
}
