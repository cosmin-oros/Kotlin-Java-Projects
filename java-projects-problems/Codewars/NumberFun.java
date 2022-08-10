package Codewars;

public class NumberFun {
    public static long findNextSquare(long sq){
        double s = Math.sqrt(sq);
        if (s!=Math.floor(s)) {
            return -1;
        }
        for (long i=sq+1;;i++) {
            s = Math.sqrt(i);
            if (s==Math.floor(s)) {
                return i;
            }
        }
    }
}
