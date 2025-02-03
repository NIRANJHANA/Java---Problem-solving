package NumberCrunching;
import java.util.*;

public class primeNumber {
    public boolean isPrime(int num){
        if(num==0 || num==1)    return false;

        if(num==2 || num==3)    return true;

        if(num%2==0 || num%3==0)    return false;

        for(int itr=5; itr*itr<num; itr+=6){
            if(num%itr==0 || num%(itr+2)==0){
                return false;
            }
        }

        return true;
    }

    public List<Integer> primeWithinRange(int start, int end){
        List<Integer> answer = new ArrayList<>();

        return answer;
    }
}
