package leetcode.solution.n5

/**
 * [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
 */
class Solution {
    fun longestPalindrome(s: String): String {
        val dp = Array(s.length) { BooleanArray(s.length) { true } }
        var max = 0..0
        for (i in s.indices) {
            for (j in i until s.length) {
                dp[j - i][j] = s[j - i] == s[j]
                if (i > 1) dp[j - i][j] = dp[j - i][j] && dp[j - i + 1][j - 1]
                if (dp[j - i][j] && i > max.last - max.first) max = j - i..j
            }
        }
        return s.substring(max.first, max.last + 1)
    }
}