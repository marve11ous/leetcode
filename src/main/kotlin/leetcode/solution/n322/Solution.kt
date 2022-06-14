package leetcode.solution.n322

/**
 * [322. Coin Change](https://leetcode.com/problems/coin-change/)
 */
class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1)
        for (i in 1..amount) {
            dp[i] = coins.filter { it <= i }.minOfOrNull { dp[i - it] } ?: Int.MAX_VALUE
            if (dp[i] != Int.MAX_VALUE) dp[i]++
        }
        return if (dp.last() == Int.MAX_VALUE) -1 else dp.last()
    }
}