package leetcode.solution.n91

/**
 * [91. Decode Ways](https://leetcode.com/problems/decode-ways/)
 */
class Solution {

    fun numDecodings(s: String): Int {
        val dp = IntArray(s.length)
        if (s.isDigitValid(0)) dp[0] = 1
        for (i in 1 until s.length) {
            if (s.isTwoDigitValid(i)) dp[i] += if (i > 1) dp[i - 2] else 1
            if (s.isDigitValid(i)) dp[i] += dp[i - 1]
        }
        return dp.last()
    }

    private fun String.isTwoDigitValid(i: Int) =
        this[i - 1] == '1' || this[i - 1] == '2' && Character.getNumericValue(this[i]) <= 6

    private fun String.isDigitValid(i: Int) = this[i] != '0'
}