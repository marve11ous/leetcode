package solution.medium.n213

import kotlin.math.max

/**
 * [213. House Robber II](https://leetcode.com/problems/house-robber-ii/)
 */
class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        return max(rob(nums, 1 until nums.size), rob(nums, 0 until nums.size - 1))
    }

    private fun rob(nums: IntArray, range: IntRange): Int {
        var prev1 = 0
        var prev2 = 0
        for (i in range) {
            val max = max(prev1 + nums[i], prev2)
            prev1 = prev2
            prev2 = max
        }
        return max(prev1, prev2)
    }
}