package solution.medium.n63

/**
 * [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
 */
class Solution {

    fun uniquePathsWithObstacles(
        obstacleGrid: Array<IntArray>,
        dp: Array<IntArray> = Array(obstacleGrid.size) { IntArray(obstacleGrid[0].size) },
        i: Int = 0,
        j: Int = 0
    ): Int {
        when {
            obstacleGrid[i][j] == 1 -> return 0
            i == dp.size - 1 && j == dp[i].size - 1 -> return 1
            dp[i][j] == 0 -> {
                if (i + 1 < dp.size) dp[i][j] += uniquePathsWithObstacles(obstacleGrid, dp, i + 1, j)
                if (j + 1 < dp[i].size) dp[i][j] += uniquePathsWithObstacles(obstacleGrid, dp, i, j + 1)
            }
        }
        return dp[i][j]
    }

}