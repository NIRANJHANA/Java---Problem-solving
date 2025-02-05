package Pattern;
import java.util.*;

public class FullPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        fullPyramid(N);
    }

    public static void fullPyramid(int N){
        int row = 1;
        while(row <= N){
            int space = N-row;
            while(space>0){
                System.out.print("  ");
                space--;
            }

            int col = 1;
            while(col <= 2*row-1){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
