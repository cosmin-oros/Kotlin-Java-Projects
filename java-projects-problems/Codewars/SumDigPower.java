package Codewars;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPower(long a,long b){
        List<Long> result = new ArrayList<>();
        for (long i=a;i<=b;i++) {
            if (isEureka(i)) {
                result.add(i);
            }
        }
        return result;
    }
    private static boolean isEureka(long n){
        long tmp = n;
        long sum=0;
        int power = length(n);
        while (tmp>0) {
            sum+=(long) Math.pow(tmp%10,power);
            power--;
            tmp/=10;
        }
        return sum==n;

    }
    private static int length(long n){
        int length =0;
        while (n>0) {
            n/=10;
            length++;
        }
        return length;
    }
}
