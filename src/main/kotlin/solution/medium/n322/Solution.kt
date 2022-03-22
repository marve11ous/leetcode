package solution.medium.n322

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount < 1) {
            return 0
        }
        return getCount(coins, amount, IntArray(amount))
    }

    private fun getCount(coins: IntArray, amount: Int, dp: IntArray): Int {
        if (amount == 0) {
            return 0
        }
        if (amount < 0) {
            return -1
        }
        if (dp[amount - 1] != 0) return dp[amount - 1]
        var min = Int.MAX_VALUE
        for (coin in coins) {
            val next = getCount(coins, amount - coin, dp)
            if (next in 0 until min) {
                min = next + 1
            }
        }
        dp[amount - 1] = if (min == Int.MAX_VALUE) -1 else min
        return dp[amount - 1]
    }


}