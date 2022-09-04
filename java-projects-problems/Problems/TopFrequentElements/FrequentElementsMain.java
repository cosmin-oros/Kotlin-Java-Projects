package Problems.TopFrequentElements;

/*
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
 */

public class FrequentElementsMain {
    public static void main(String[] args){
        FrequentElementsSol sol = new FrequentElementsSol();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topApps = sol.topKFrequent(nums, k);
        for (int i = 0; i < topApps.length; i++){
            System.out.print(topApps[i] + " ");
        }
    }
}
