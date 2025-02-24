package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SuppressWarnings("unused")
public class Main {
/* 
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        // System.out.println(10/0); // RTE: unchecked - compiled successfully
        // FileReader f = new FileReader("Main.java"); // CE: checked
    }
*/

    // Handling with try-catch
/*
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("catch");
        }
    }
*/

    // Handling with throws 
    // Unchecked Exception
/*
    public static void main(String[] args) throws Exception {
        m1();
        System.out.println("main");
    }

    public static void m1() throws Exception {
        m2();
        System.out.println("m1");
    }

    public static void m2() throws Exception {
        System.out.println(10/0);
        System.out.println("m2");
    }
*/


/*
public static void main(String[] args) throws FileNotFoundException {
    m1();
    System.out.println("main");
}

public static void m1() throws FileNotFoundException {
    m2();
    System.out.println("m1");
}

public static void m2() throws FileNotFoundException {
    FileReader f = new FileReader("Main.java");
    System.out.println("m2");
}
*/

// checked
/* 
    public static void main(String[] args) {
        try{
            m1();
        }
        catch(FileNotFoundException e){
            System.out.println("catch");
        }
        
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        FileReader f = new FileReader("Main.java");
    }
*/

// unchecked
/* 
    public static void main(String[] args) {
        try {
            m1();
        }
        catch(ArithmeticException e) {
            
        }
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        System.out.println(10/0); 
    }
*/

}

