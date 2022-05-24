package solution.medium.n474

/**
 * [474. Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/)
 */
class Solution {
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) }
        strs.forEach { str ->
            var one = 0
            var zero = 0
            str.forEach { if (it == '0') zero++ else one++ }
            (m downTo zero).forEach { i ->
                (n downTo one).forEach { j ->
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1)
                }
            }
        }
        return dp[m][n]
    }
}