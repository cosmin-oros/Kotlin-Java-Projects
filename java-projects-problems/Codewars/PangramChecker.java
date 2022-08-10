package Codewars;

import java.util.Locale;

public class PangramChecker {
    public static boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;
    }
}
