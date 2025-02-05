package Pattern;
import java.util.*;

public class RightHalfPyramidStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        
        int row = 1;
        while(row <= N){
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }

        sc.close();;
    }
}
