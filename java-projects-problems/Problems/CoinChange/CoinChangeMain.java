package Problems.CoinChange;

/*
    You are given an integer array coins representing coins of different denominations and an integer amount
    representing a total amount of money.

    Return the fewest number of coins that you need to make up that amount.
    If that amount of money cannot be made up by any combination of the coins, return -1.

    You may assume that you have an infinite number of each kind of coin.

    Input: coins = [1,2,5], amount = 11
    Output: 3
    Explanation: 11 = 5 + 5 + 1
 */

public class CoinChangeMain {
    public static void main(String[] args){
        CoinChangeSol change = new CoinChangeSol();
        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(change.coinChange(coins, amount));
    }
}
