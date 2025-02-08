package Pattern;

import java.util.*;

public class NumberPattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        sc.close();

        pattern(N);
        
    }

    public static List<List<Integer>> pattern(int N){
        List<List<Integer>> ans = new ArrayList<>();
        int row = 1;
        int value = 1;
        while(row <= N){
            List<Integer> temp = new ArrayList<>();
            int col = 1;
            while(col <= row){
                temp.add(value);
                value++;
            }
            temp = reverse(temp);
            ans.add(temp);
            System.out.println(temp);
        }

        return ans;
    }

    public static List<Integer> reverse(List<Integer> list){
        List<Integer> result = new ArrayList<>();
        int size = list.size();

        for(int idx=size-1; idx>=0; idx--){
            result.add(list.get(idx));
        }

        return result;
    }
}
