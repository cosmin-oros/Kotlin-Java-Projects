package Problems.LongestPalindromicSubstring;

/*
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
 */

public class PalMain {
    public static void main(String[] args){
        PalSol sol = new PalSol();
        String longestPal = sol.longestPalindrome("babad");
        System.out.println(longestPal);
    }
}
