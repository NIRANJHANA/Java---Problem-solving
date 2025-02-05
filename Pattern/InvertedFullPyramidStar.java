package Pattern;
import java.util.*;

public class InvertedFullPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        invertedFullPyramid(N);
    }

    public static void invertedFullPyramid(int N){
        int row = N;
        while(row>0){
            int space = N-row;
            while(space>0){
                System.out.print("  ");
                space--;
            }

            int col = 1;
            while(col < 2*row){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row--;
        }
    }
}
