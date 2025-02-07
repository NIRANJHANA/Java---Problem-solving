package NumberCrunching;
import NumberCrunching.*;

public class Main {
    public static void main(String[] args){



        // factorial f = new factorial();
        // System.out.println(f.fact(5)); - it'll run, but give warning: The static method fact(int) from the type factorial should be accessed in a static way
        System.out.println("Factorial: " + Factorial.fact(5));

        // Fibonacci
        int[] ans = fibonacci.FirstNfibonacciSeries(5);
        
        System.out.print("Fibonacci: ");
        for(int num : ans){
            System.out.print(num+" ");
        }
        
        //  Nth fibonacci number
        System.out.println("\nFibonacci - " + 5 + " : " + fibonacci.NthFibonacci(5));

        // LCM, GCD
        System.out.println("LCM(20,30): " + lcmGcd.lcm(20, 30) + "GCD(20,30): " + lcmGcd.gcd(20, 30));
    }
}
