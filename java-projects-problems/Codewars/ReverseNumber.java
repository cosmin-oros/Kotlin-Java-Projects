package Codewars;

public class ReverseNumber {
    public static int reverse(int n){
        int finalNr=0;
        while (n!=0) {
            finalNr=finalNr*10+n%10;
            n/=10;
        }
        return finalNr;
    }
}
