package Pattern;
import NumberCrunching.Factorial;

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        int[][] triangle = pascalsTriangle(N);
        int space = N-1;
        for(int[] row: triangle){
            for(int sp=0; sp<space; sp++)  
                System.out.print("  ");

            for(int col: row){
                System.out.printf("%02d ", col);
            }
            space--;
            System.out.println();
        }

        System.out.print(N + "th Row: " + nthRow(N));
    }

    public static int[][] pascalsTriangle(int N){
        int[][] ans = new int[N][];

        for(int row=0; row<N; row++){
            ans[row] = new int[row+1];
            ans[row][0] = 1;
            for(int col=1; col<row; col++){
                ans[row][col] = ans[row-1][col-1] + ans[row-1][col];
            }
            ans[row][row] = 1;
        }

        return ans;
    }

    public static List<Integer> nthRow(int N){
        List<Integer> ans = new ArrayList<>();

        for(int index=0; index<=N; index++){

            ans.add(currElement(N, index));
        }

        return ans;
    }

    public static int currElement(int n, int k){
        int element = Factorial.fact(n) / (Factorial.fact(k)*(Factorial.fact(n-k)));

        return element;
    }
}
