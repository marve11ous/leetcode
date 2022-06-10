package leetcode.solution.n221

/**
 * [221. Maximal Square](https://leetcode.com/problems/maximal-square/)
 */
class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val dp = Array(matrix.size) { IntArray(matrix[0].size) }
        var result = 0
        for (i in dp.indices) {
            for (j in dp[0].indices) {
                if (matrix[i][j] == '1') {
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j - 1]
                        dp[i][j] = dp[i][j].coerceAtMost(dp[i - 1][j])
                        dp[i][j] = dp[i][j].coerceAtMost(dp[i][j - 1])
                    }
                    dp[i][j]++
                }
                result = result.coerceAtLeast(dp[i][j])
            }
        }
        return result * result
    }
}