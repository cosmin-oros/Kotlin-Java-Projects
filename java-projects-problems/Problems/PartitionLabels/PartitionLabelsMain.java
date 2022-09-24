package Problems.PartitionLabels;

/*
    You are given a string s.
    We want to partition the string into as many parts as possible so that each letter appears in at most one part.

    Input: s = "ababcbacadefegdehijhklij"
    Output: [9,7,8]
    Explanation:
    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 */

import java.util.List;

public class PartitionLabelsMain {
    public static void main(String[] args){
        PartitionLabelsSol part = new PartitionLabelsSol();
        String s = "ababcbacadefegdehijhklij";

        List l = part.partitionLabels(s);

        for (int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + " ");
        }
    }
}
