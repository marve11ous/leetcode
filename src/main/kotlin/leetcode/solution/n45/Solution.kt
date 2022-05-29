package leetcode.solution.n45

/**
 * [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)
 */
class Solution {
    fun jump(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        for (i in nums.indices) {
            var j = i
            while (j < i + nums[i] && j + 1 < nums.size) {
                dp[++j] = if (dp[j] == 0) dp[i] + 1 else dp[j].coerceAtMost(dp[i] + 1)
            }
        }
        return dp.last()
    }
}