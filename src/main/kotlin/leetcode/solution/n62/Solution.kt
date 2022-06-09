package leetcode.solution.n62

/**
 * [62. Unique Paths](https://leetcode.com/problems/unique-paths/)
 */
class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) }
        dp[0][0] = 1
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i > 0) dp[i][j] += dp[i - 1][j]
                if (j > 0) dp[i][j] += dp[i][j - 1]
            }
        }
        return dp[m - 1][n - 1]
    }
}