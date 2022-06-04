package leetcode.solution.n42

import kotlin.math.min

/**
 * [42. Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
 */
class Solution {
    fun trap(height: IntArray): Int {
        val rightMax = IntArray(height.size)
        rightMax[height.size - 1] = height.last()
        for (i in height.size - 2 downTo 0) {
            rightMax[i] = rightMax[i + 1].coerceAtLeast(height[i])
        }

        val leftMax = IntArray(height.size)
        leftMax[0] = height[0]
        for (i in 1 until height.size) {
            leftMax[i] = leftMax[i - 1].coerceAtLeast(height[i])
        }

        var result = 0
        for (i in height.indices) {
            result += min(leftMax[i], rightMax[i]) - height[i]
        }
        return result
    }
}