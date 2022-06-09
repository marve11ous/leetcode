package leetcode.solution.n63

/**
 * [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
 */
class Solution {

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val dp = Array(obstacleGrid.size) { IntArray(obstacleGrid[0].size) }
        if (obstacleGrid[0][0] == 1) return 0
        dp[0][0] = 1
        for (i in dp.indices) {
            for (j in dp[0].indices) {
                if (obstacleGrid[i][j] == 1) continue
                if (i > 0) dp[i][j] += dp[i - 1][j]
                if (j > 0) dp[i][j] += dp[i][j - 1]
            }
        }
        return dp.last().last()
    }

}