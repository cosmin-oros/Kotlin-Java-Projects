package Problems.DuplicateNumber;

/*
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

    There is only one repeated number in nums, return this repeated number.

    You must solve the problem without modifying the array nums and uses only constant extra space.

    Input: nums = [1,3,4,2,2]
    Output: 2
 */

public class DuplicateNumberMain {
    public static void main(String[] args){
        DuplicateNumberSol dup = new DuplicateNumberSol();
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(dup.findDuplicate(nums));
    }
}
