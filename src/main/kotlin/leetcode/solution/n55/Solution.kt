package leetcode.solution.n55

/**
 * [55. Jump Game](https://leetcode.com/problems/jump-game/)
 */
class Solution {
    fun canJump(nums: IntArray, dp: IntArray = IntArray(nums.size), i: Int = 0): Boolean {
        if (i == nums.size - 1) return true
        if (dp[i] != 0) return dp[i] > 0
        val max = (nums[i] + i).coerceAtMost(nums.size - 1)
        for (j in i + 1..max) {
            if (canJump(nums, dp, j)) {
                dp[i] = 1
                return true
            }
        }
        dp[i] = -1
        return false
    }

}