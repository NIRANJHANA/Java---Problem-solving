package NumberCrunching;
// import java.util.*;

public class fibonacci {
    public static int[] FirstNfibonacciSeries(int n){
        int[] ans = new int[n];
        ans[0] = 0;
        ans[1] = 1;

        for(int itr=2; itr<n; itr++){
            ans[itr] = ans[itr-1] + ans[itr-2];
        }

        return ans;
    }

    public static int NthFibonacci(int n){
        if(n<=1)    return n;
        return NthFibonacci(n-1) + NthFibonacci(n-2);
    }
}