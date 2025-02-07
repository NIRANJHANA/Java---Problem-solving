package Pattern;
import java.util.*;

public class alphabet_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        int row = 0;
        while(row < N){
            int col = row;
            while(col < N){
                System.out.printf("%c ", (char)(col+65));
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
