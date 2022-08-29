package Problems.GroupAnagrams;

/*
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

public class AnagramsMain {
    public static void main(String[] args){
        AnagramsSol sol = new AnagramsSol();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(sol.groupAnagrams(strs));
    }
}
