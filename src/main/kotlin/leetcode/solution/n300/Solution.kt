package leetcode.solution.n300

/**
 * [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
 */
class Solution {

    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var result = 0
        val dp = IntArray(nums.size)
        for (i in 1 until nums.size) {
            for (j in 0 until i) {
                if (nums[i] > nums[j]) dp[i] = dp[i].coerceAtLeast(dp[j] + 1)
            }
            result = result.coerceAtLeast(dp[i])
        }
        return result + 1
    }
}