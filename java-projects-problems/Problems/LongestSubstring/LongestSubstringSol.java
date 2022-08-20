package Problems.LongestSubstring;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringSol {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int k = 0, max = 0;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while (seen.contains(c)){
                seen.remove(s.charAt(k++));
            }

            seen.add(c);
            max = Math.max(max, i - k + 1);

        }
        return max;
    }
}
