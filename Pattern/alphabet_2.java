package Pattern;

import java.util.Scanner;

public class alphabet_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        int row = N-1;
        while(row >= 0){
            int col = row;
            while(col >= 0){
                System.out.print((char)(row+65) + " ");
                col--;
            }
            System.out.println();
            row--;
        }
    }
}
