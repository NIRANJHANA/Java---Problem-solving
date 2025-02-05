package Pattern;

import java.util.Scanner;

public class StairCase_2 {
    public static void invertedStairCase_2(int N){
        int stairLength = N;
        int space = 0;
        int row = N;
        while(row > 0){
            for(int sp=0; sp<space; sp++){
                System.out.print("  ");
            }

            for(int col=0; col<stairLength; col++){
                System.out.print("* ");
            }

            System.out.println();

            if(row%2 != 0){
                space++;
                stairLength -= 2;
            }
            row--;
        }
    }

    public static void stairCase_2(int N){
        int stairLength = 2;
        int space = (N-1) / 2;
        int row = 1;

        while(row <= N){

            for(int sp=0; sp<space; sp++){
                System.out.print("  ");
            }

            int col = 1;
            while(col <= stairLength){
                System.out.print("* ");
                col++;
            }

            System.out.println();

            if(row%2 == 0){
                stairLength += 2;
                space--;
            }  
            row++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println("Normal: ");
        stairCase_2(N);

        System.out.println("Inverted: ");
        invertedStairCase_2(N);
    }
}
