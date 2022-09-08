package Problems.NextPermutation;

/*
Input: nums = [1,2,3]
Output: [1,3,2]
 */

public class PermutationMain {
    public static void main(String[] args){
        PermutationSol sol = new PermutationSol();
        int[] nums = {1, 2, 3};

        sol.nextPermutation(nums);
    }
}
