package Problems.StrStr;

public class StrStrMain {
    public static void main(String args[]){
        StrStrSolution sol = new StrStrSolution();
        String s1 = "John has apples";
        String s2 = "has";

        //index of first occurance of s2 in s1
        int n = sol.strStr(s1, s2);

        System.out.println(n);
    }
}
