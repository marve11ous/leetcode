package leetcode.solution.n198

import kotlin.math.max

/**
 * [198. House Robber](https://leetcode.com/problems/house-robber/)
 */
class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var prev1 = 0
        var prev2 = 0
        nums.forEach {
            val max = max(prev1 + it, prev2)
            prev1 = prev2
            prev2 = max
        }
        return max(prev1, prev2)
    }
}