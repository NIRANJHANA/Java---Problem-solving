package Pattern;
import java.util.*;

public class InvertedLeftHalfPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();

        int row = N;
        while(row>=1){
            int space = N-row;
            while(space>0){
                System.out.print("  ");
                space--;
            }

            int col = row;
            while(col>0){
                System.out.print("* ");
                col--;
            }

            System.out.println();
            row--;
        }

        sc.close();
    }
    
}
