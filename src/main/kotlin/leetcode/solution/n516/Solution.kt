package leetcode.solution.n516

import kotlin.math.max

/**
 * [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)
 */
class Solution {
    fun longestPalindromeSubseq(s: String): Int {
        val dp = Array(s.length) { IntArray(s.length) { 1 } }
        var result = 1
        for (i in s.indices) {
            for (j in i - 1 downTo 0) {
                if (s[i] == s[j]) {
                    when (i) {
                        j + 1 -> dp[i][j] = 2
                        else -> dp[i][j] = dp[i - 1][j + 1] + 2
                    }
                } else {
                    dp[i][j] = max(dp[i - 1][j], dp[i][j + 1])
                }
                result = result.coerceAtLeast(dp[i][j])
            }
        }
        return result
    }
}