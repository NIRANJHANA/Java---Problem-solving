package Pattern;
import java.util.*;

public class HollowRectangleStar {
    public static void hollowRectangle(int length, int breadth){
        int row = 1;
        while(row <= length){
            int col = 1;
            while(col <= breadth){
                if(row==1 || row==length || col==1 || col==breadth)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Row & Column: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        sc.close();

        hollowRectangle(row, column);
    }
}
