package Pattern;

import java.util.*;

public class NumberPattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        int row = 1;
        while(row <= N){
            int col = 1;
            int val = row;
            while(col <= N){
                System.out.print(val + " ");
                if(val == N)    val = 1;
                else    val++;
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
