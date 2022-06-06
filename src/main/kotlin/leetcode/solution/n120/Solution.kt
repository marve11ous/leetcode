package leetcode.solution.n120

import kotlin.math.min

/**
 * [120. Triangle](https://leetcode.com/problems/triangle/)
 */
class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        var prev = ArrayList(triangle[0])
        for (i in 1 until triangle.size) {
            val nums = triangle[i]
            val next = ArrayList(nums)
            next[0] += prev[0]
            for (j in 1 until nums.size - 1) {
                next[j] += min(prev[j - 1], prev[j])
            }
            next[nums.size - 1] += prev[nums.size - 2]
            prev = next
        }
        return prev.minOrNull() ?: 0
    }
}