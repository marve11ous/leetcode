package leetcode.solution.n64

/**
 * [64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)
 */
class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val dp = Array(grid.size) { IntArray(grid[0].size) { Int.MAX_VALUE } }
        dp[0][0] = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (j > 0) dp[i][j] = dp[i][j - 1]
                if (i > 0) dp[i][j] = dp[i][j].coerceAtMost(dp[i - 1][j])
                dp[i][j] += grid[i][j]
            }
        }
        return dp.last().last()
    }
}