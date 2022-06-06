package leetcode.solution.n96

/**
 * [96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees/)
 */
class Solution {
    fun numTrees(n: Int, dp: IntArray = IntArray(n + 1)): Int {
        if (n < 2) return 1
        if (dp[n] == 0) {
            for (i in 1..n) {
                dp[n] += numTrees(i - 1, dp) * numTrees(n - i, dp)
            }
        }
        return dp[n]
    }
}