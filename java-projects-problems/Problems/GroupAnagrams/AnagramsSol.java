package Problems.GroupAnagrams;

import java.util.*;

class AnagramsSol {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> groups = new HashMap<>();

        for (String str : strs){
            List<Integer> count = new ArrayList<>(26);

            for (int i = 0; i < 26; i++){
                count.add(0);
            }

            for (int i = 0; i < str.length(); i++){
                int index = str.charAt(i) - 'a';
                count.set(index, count.get(i) + 1);
            }

            int code = count.hashCode();
            if (groups.containsKey(code)){
                groups.get(code).add(str);
            }else{
                List<String> words = new LinkedList<>();
                words.add(str);
                groups.put(code, words);
            }

        }

        List<List<String>> result = new LinkedList<>();

        for(List<String> list: groups.values()){
            result.add(list);
        }

        return result;
    }
}
