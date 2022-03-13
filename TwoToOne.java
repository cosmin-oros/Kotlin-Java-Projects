package Codewars;

public class TwoToOne {
    public static String longest(String s1,String s2){
        String out = "";
        String s = s1+s2;
        for (char c='a';c<='z';c++) {
            if (s.contains(c+"")) {
                out+=c;
            }
        }
        return out;
    }
}
