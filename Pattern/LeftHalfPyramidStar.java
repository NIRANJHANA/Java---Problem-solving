package Pattern;
import java.util.*;

public class LeftHalfPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        leftHalfPyramidStar(N);
    }

    public static void leftHalfPyramidStar(int N){
        int row = 1;
        while(row<=N){
            int space = N-row;
            while(space>0){
                System.out.print("  ");
                space--;
            }

            int col = 1;
            while(col<=row){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
        }
    }
}
