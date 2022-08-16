package Problems.HappyNumber;

import static java.lang.Math.pow;

class HappyNumberSol {
    public boolean isHappy(int n) {
        int newNr, c;

        while(n >= 10){
            newNr = n;
            c = 0;
            while (newNr > 0){
                c += pow(newNr % 10, 2);
                newNr /= 10;
            }
            n = c;
        }

        return n == 1;
    }
}
