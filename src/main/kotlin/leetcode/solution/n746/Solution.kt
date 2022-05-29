package leetcode.solution.n746

import kotlin.math.min

/**
 * [746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)
 */
class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var prev1 = 0
        var prev2 = 0
        cost.forEach {
            val min = min(prev1, prev2) + it
            prev1 = prev2
            prev2 = min
        }
        return min(prev1, prev2)
    }
}