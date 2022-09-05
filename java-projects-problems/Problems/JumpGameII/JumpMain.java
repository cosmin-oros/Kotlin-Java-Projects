package Problems.JumpGameII;

/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

public class JumpMain {
    public static void main(String[] args){
        JumpSol sol = new JumpSol();
        int[] nums = {2, 3, 1, 1, 4};

        System.out.println(sol.jump(nums));
    }
}
