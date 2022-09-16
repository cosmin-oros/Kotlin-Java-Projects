package Problems.MinWindowSubstring;

import java.util.HashMap;
import java.util.Map;

class WindowSubstringSol {
    public String minWindow(String s, String t) {
        // sliding window approach
        /*
            In any sliding window based problem we have two pointers. One rightright pointer whose job
            is to expand the current window and then we have the leftleft pointer whose job is to contract a given window.
            At any point in time only one of these pointers move and the other one remains fixed.
         */

        if (s.length() == 0 || t.length() == 0){
            return "";
        }

        // unique chars in t
        Map<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < t.length(); i++){
            int count = dictionary.getOrDefault(t.charAt(i), 0);
            dictionary.put(t.charAt(i), count + 1);
        }

        // Number of unique characters in t, which need to be present in the desired window.
        int required = dictionary.size();

        // Left and Right pointer
        int l = 0, r = 0;
        int formed = 0;

        // dictionary which keeps a count of all the unique characters in the current window.
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

        // ans list of the form (window length, left, right)
        int[] ans = { -1, 0, 0 };

        while (r < s.length()) {
            // Add one character from the right to the window
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            // If the frequency of the current character added equals to the
            // desired count in t then increment the formed count by 1.
            if (dictionary.containsKey(c) && windowCounts.get(c).intValue() == dictionary.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = s.charAt(l);
                // Save the smallest window until now.
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                // The character at the position pointed by the
                // `Left` pointer is no longer a part of the window.
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictionary.containsKey(c) && windowCounts.get(c).intValue() < dictionary.get(c).intValue()) {
                    formed--;
                }

                // Move the left pointer ahead, this would help to look for a new window.
                l++;
            }

            // Keep expanding the window once we are done contracting.
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
