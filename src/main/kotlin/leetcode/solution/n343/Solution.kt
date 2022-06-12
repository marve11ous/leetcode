package leetcode.solution.n343

/**
 * [343. Integer Break](https://leetcode.com/problems/integer-break/)
 */
class Solution {
    fun integerBreak(n: Int): Int {
        if (n < 4) return n - 1
        return integerBreak(IntArray(n + 1), n)
    }

    private fun integerBreak(dp: IntArray, n: Int): Int {
        if (n == 1) return 1
        if (dp[n] == 0) {
            dp[n] = n
            for (i in 1 until n) {
                dp[n] = dp[n].coerceAtLeast(i * integerBreak(dp, n - i))
            }
        }
        return dp[n]
    }
}