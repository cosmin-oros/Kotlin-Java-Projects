package Problems.TwoSum;

public class TwoSumProblem {
    public static void main(String args[]){
        TwoSum sum = new TwoSum();
        int[] nrs = {1, 2, 3, 4, 5};
        int target = 5;
        int[] n = sum.twoSum(nrs, target);
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}
