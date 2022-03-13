package Codewars;

import java.util.*;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements,int maxOccurances){
        Map<Integer, Integer> counts = new HashMap<>();
        int dest = 0;
        for (int val : elements) {
            int qty = counts.getOrDefault(val, 0);
            if (++qty <= maxOccurances) {
                elements[dest++] = val;
            }
            counts.put(val, qty);
        }
        return Arrays.copyOfRange(elements, 0, dest);
    }
}
