package leetcode.solution.n931

/**
 * [931. Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/)
 */
class Solution {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val dp = Array(matrix.size) { row ->
            IntArray(matrix[0].size) { if (row == matrix.size - 1) matrix[row][it] else Int.MAX_VALUE }
        }
        matrix[0].indices.forEach { dp(matrix, 0, it, dp) }
        return dp[0].minOrNull() ?: 0
    }

    private fun dp(matrix: Array<IntArray>, row: Int, col: Int, dp: Array<IntArray>): Int {
        if (dp[row][col] == Int.MAX_VALUE) {
            for (j in col - 1..col + 1) {
                if (j in matrix[0].indices) {
                    dp[row][col] = dp[row][col].coerceAtMost(dp(matrix, row + 1, j, dp))
                }
            }
            dp[row][col] += matrix[row][col]
        }
        return dp[row][col]
    }
}