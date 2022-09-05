package Problems.JumpGameII;

class JumpSol {
    public int jump(int[] nums) {
        int n = nums.length;
        int jump = 1;
        int max = nums[0];
        int i = 1;
        while(i < n){
            if(max >= n-1){
                return jump;
            }
            int point = max;
            while(i<=point){
                max=Math.max(max,i+nums[i]);
                i++;
            }
            jump++;
        }
        return 0;
    }
}
