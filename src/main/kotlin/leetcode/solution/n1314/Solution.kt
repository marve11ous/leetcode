package leetcode.solution.n1314

/**
 * [1314. Matrix Block Sum](https://leetcode.com/problems/matrix-block-sum/)
 */
class Solution {
    fun matrixBlockSum(mat: Array<IntArray>, k: Int): Array<IntArray> {
        val dp = Array(mat.size) { IntArray(mat[0].size) }
        for (i in mat.indices) {
            var j = 0
            while (j <= k && j < mat[0].size) {
                dp[i][0] += mat[i][j++]
            }
        }
        for (i in mat.indices) {
            for (j in 1 until mat[0].size) {
                dp[i][j] = dp[i][j - 1]
                if (j + k < mat[0].size) dp[i][j] += mat[i][j + k]
                if (j - k > 0) dp[i][j] -= mat[i][j - k - 1]
            }
        }
        val result = Array(mat.size) { IntArray(mat[0].size) }
        for (j in mat[0].indices) {
            var i = 0
            while (i <= k && i < mat.size) {
                result[0][j] += dp[i++][j]
            }
        }
        for (i in 1 until mat.size) {
            for (j in mat[0].indices) {
                result[i][j] = result[i - 1][j]
                if (i + k < mat.size) result[i][j] += dp[i + k][j]
                if (i - k > 0) result[i][j] -= dp[i - k - 1][j]
            }
        }
        return result
    }
}