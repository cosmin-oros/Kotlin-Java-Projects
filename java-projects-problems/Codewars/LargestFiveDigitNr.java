package Codewars;

public class LargestFiveDigitNr {
    public static int solve(final String digits) {
        int largest = Integer.MIN_VALUE;
        if(digits.length()<5){
            return 0;
        }
        for (int i=0;i<=digits.length()-5;i++){
            int number = Integer.parseInt(digits.substring(i,i+5));
            largest = Math.max(number,largest);
        }
        return largest;
    }
}
