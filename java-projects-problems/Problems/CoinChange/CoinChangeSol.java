package Problems.CoinChange;

import java.util.Arrays;

class CoinChangeSol {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }

        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int coin : coins){
            for (int i = coin; i <= amount; i++){
                if(dp[i-coin]==Integer.MAX_VALUE){
                    continue;
                }
                dp[i]=Math.min(1+dp[i-coin],dp[i]);
            }
        }

        return dp[amount] == Integer.MAX_VALUE? -1 : dp[amount];

    }
}
