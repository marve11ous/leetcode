package leetcode.solution.n72

/**
 * [72. Edit Distance](https://leetcode.com/problems/edit-distance/)
 */
class Solution {
    fun minDistance(word1: String, word2: String): Int {
        val dp = Array(word1.length + 1) { IntArray(word2.length + 1) }
        for (i in 0..word1.length) {
            for (j in 0..word2.length) {
                dp[i][j] = when {
                    i == 0 -> j
                    j == 0 -> i
                    word1[i - 1] == word2[j - 1] -> dp[i - 1][j - 1]
                    else -> 1 + dp[i - 1][j - 1].coerceAtMost(dp[i - 1][j]).coerceAtMost(dp[i][j - 1])
                }
            }
        }
        return dp.last().last()
    }
}