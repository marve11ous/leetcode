package leetcode.solution.n1143

import kotlin.math.max

/**
 * [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
 */
class Solution {
    fun longestCommonSubsequence(text1: String, text2: String): Int {
        val dp = Array(text1.length + 1) { IntArray(text2.length + 1) }
        for (i in 1..text1.length) {
            for (j in 1..text2.length) {
                dp[i][j] = if (text1[i - 1] == text2[j - 1]) {
                    dp[i - 1][j - 1] + 1
                } else {
                    max(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        return dp.last().last()
    }
}