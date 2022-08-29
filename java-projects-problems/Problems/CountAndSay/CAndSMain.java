package Problems.CountAndSay;

/*
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */

public class CAndSMain {
    public static void main(String[] args){
        CAndSSol sol = new CAndSSol();

        System.out.println(sol.countAndSay(4));
    }
}
