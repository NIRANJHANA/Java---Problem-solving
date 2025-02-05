package Pattern;
import java.util.*;

public class InvertedRightHalfPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");

        int N = sc.nextInt();

        int row = N;
        while(row>=1){
            int col = row;
            while(col>=1){
                System.out.print("* ");
                col--;
            }
            System.out.println();
            row--;
        }

        sc.close();
    }
}
