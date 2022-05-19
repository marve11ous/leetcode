package solution.hard.n329

/**
 * [329. Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)
 */
class Solution {

    private companion object {
        val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    }

    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        val dp = Array(matrix.size) { IntArray(matrix[0].size) }
        var result = 0
        (matrix.indices).forEach { i ->
            (matrix[i].indices).filter { dp[i][it] == 0 }
                .forEach { result = Math.max(result, longestIncreasingPath(matrix, dp, i, it)) }
        }
        return result
    }

    private fun longestIncreasingPath(matrix: Array<IntArray>, dp: Array<IntArray>, i: Int, j: Int): Int {
        if (dp[i][j] == 0) {
            var result = 1
            for (direction in directions) {
                val k = i + direction.first
                val l = j + direction.second
                if (k in matrix.indices && l in matrix[0].indices && matrix[k][l] > matrix[i][j]) {
                    result = Math.max(result, longestIncreasingPath(matrix, dp, k, l) + 1)
                }
            }
            dp[i][j] = result
        }
        return dp[i][j]
    }
}