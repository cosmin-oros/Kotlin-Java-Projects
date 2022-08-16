package Problems.HappyNumber;

/*
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

public class HappyNumberMain {
    public static void main(String args[]){
        HappyNumberSol nr = new HappyNumberSol();
        Boolean isHappy = nr.isHappy(19);
        System.out.println(isHappy);
    }
}
