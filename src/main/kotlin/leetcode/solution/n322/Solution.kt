package leetcode.solution.n322

/**
 * [322. Coin Change](https://leetcode.com/problems/coin-change/)
 */
class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        return if (amount < 1) return 0 else coinChange(coins, amount, IntArray(amount))
    }

    private fun coinChange(coins: IntArray, amount: Int, dp: IntArray): Int {
        return when {
            amount == 0 -> 0
            amount < 0 -> -1
            else -> {
                if (dp[amount - 1] == 0) {
                    var min = Int.MAX_VALUE
                    coins.forEach { coin ->
                        val next = coinChange(coins, amount - coin, dp)
                        if (next in 0 until min) min = next + 1
                    }
                    dp[amount - 1] = if (min == Int.MAX_VALUE) -1 else min
                }
                dp[amount - 1]
            }
        }
    }

}