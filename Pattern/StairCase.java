package Pattern;
import java.util.*;

public class StairCase {

    public static void invertedStairCase(int N){
        int stairLength = N;
        int row = N;
        while(row > 0){

            for(int col=0; col<stairLength; col++){
                System.out.print("* ");
            }

            System.out.println();

            if(row%2 != 0)  stairLength -= 2;
            row--;
        }
    }

    public static void stairCase(int N){
        int stairLength = 2;
        int row = 1;

        while(row <= N){

            int col = 1;
            while(col <= stairLength){
                System.out.print("* ");
                col++;
            }

            System.out.println();

            if(row%2 == 0)  stairLength += 2;
            row++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println("Normal: ");
        stairCase(N);

        System.out.println("Inverted: ");
        invertedStairCase(N);
    }
}
