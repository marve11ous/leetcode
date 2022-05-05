package solution.medium.n462

import kotlin.math.abs

/**
 * [462. Minimum Moves to Equal Array Elements II](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)
 */
class Solution {
    fun minMoves2(nums: IntArray): Int {
        nums.sort()
        val med = nums[nums.size / 2]
        return nums.sumOf { abs(it - med) }
    }
}
