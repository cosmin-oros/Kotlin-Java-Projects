package Problems.ClimbingStairs;

class ClimbingStairsSol {
    public int climbStairs(int n) {
        // 4 -> 1 1 1 1 | 2 1 1 | 1 2 1 | 1 1 2 | 2 2
        if (n == 1){
            return 1;
        }
        int ways[] = new int[n];

        ways[n-1] = 1;
        ways[n-2] = 1;

        for (int i = n-3; i >= 0; i--){
            ways[i] = ways[i+1] + ways[i+2];
        }

        return ways[0] + ways[1];
    }
}
