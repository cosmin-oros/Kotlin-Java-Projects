package Codewars;

public class CountDivisors {
    public static long count(int n){
        int cntr = 0;
        for (int i = 1; i <= n/2; i++)
            if (n % i == 0) cntr++;
        return (n == 0)? 0 : ++cntr;
    }
}
