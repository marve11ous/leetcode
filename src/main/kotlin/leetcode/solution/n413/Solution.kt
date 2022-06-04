package leetcode.solution.n413

/**
 * [413. Arithmetic Slices](https://leetcode.com/problems/arithmetic-slices/)
 */
class Solution {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        var result = 0
        for (i in 2 until nums.size) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1
                result += dp[i]
            }
        }
        return result
    }
}