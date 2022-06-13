package leetcode.solution.n279

/**
 * [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)
 */
class Solution {
    fun numSquares(n: Int): Int {
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[0] = 0
        for (i in 1..n) {
            var j = 0
            while (++j * j <= i) {
                dp[i] = dp[i].coerceAtMost(dp[i - j * j] + 1)
            }
        }
        return dp.last()
    }
}