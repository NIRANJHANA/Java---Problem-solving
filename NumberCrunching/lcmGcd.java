package NumberCrunching;

public class lcmGcd {
    public static int lcm(int num1, int num2){
        return (num1 * num2) / gcd(num1,num2);
    }

    public static int gcd(int num1, int num2){
        if(num2 == 0)   return num1;

        return gcd(num2, num1%num2);
    }
}
