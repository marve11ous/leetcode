package leetcode.solution.n518

/**
 * [518. Coin Change 2](https://leetcode.com/problems/coin-change-2/)
 */
class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1)
        dp[0] = 1
        coins.forEach { coin ->
            for (j in coin..amount) {
                dp[j] += dp[j - coin]
            }
        }
        return dp[amount]
    }
}