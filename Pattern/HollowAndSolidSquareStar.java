package Pattern;
import java.util.*;

public class HollowAndSolidSquareStar {
    public void hollowSquare(int N){
        int row = 1;
        while(row <= N){
            int col = 1;
            while(col <= N){
                if(row==1 || row==N || col==1 || col==N)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public void solidSquare(int N){
        int row = 1;
        while(row <= N){
            int col = 1;
            while(col <= N){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        HollowAndSolidSquareStar square = new HollowAndSolidSquareStar();

        System.out.println("Hollow Square");
        square.hollowSquare(N);

        System.out.println("Solid Square");
        square.solidSquare(N);
    }

}
