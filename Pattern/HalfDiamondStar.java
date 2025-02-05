package Pattern;
import java.util.*;

public class HalfDiamondStar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        halfDiamondStar(N);
    }

    public static void halfDiamondStar(int N){
        int row = 1;
        while(row<=N){
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }

            System.out.println();
            row++;
        }

        row = N-1;
        while(row > 0){
            int col = row;
            while(col > 0){
                System.out.print("* ");
                col--;
            }

            System.out.println();
            row--;
        }
    }
}
