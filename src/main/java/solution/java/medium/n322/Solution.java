package solution.java.medium.n322;

/**
 * 322. Coin Change
 * <p>
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the
 * fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any
 * combination of the coins, return -1.
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount];
        for (int i = 1; i <= amount; i++) {
            rec(coins, i, dp);
        }
        return dp[amount - 1];
    }

    public int rec(int[] coins, int amount, int[] dp) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        if (dp[amount - 1] > 0) {
            return dp[amount - 1];
        }
        int result = Integer.MAX_VALUE;
        for (int coin : coins) {
            int rec = rec(coins, amount - coin, dp) + 1;
            if (rec > 0 && rec < result) {
                result = rec;
            }
        }
        dp[amount - 1] = result == Integer.MAX_VALUE ? -1 : result;
        return dp[amount - 1];
    }
}