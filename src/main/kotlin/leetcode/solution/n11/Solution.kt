package leetcode.solution.n11

/**
 * [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size - 1
        var result = 0
        while (l < r) {
            val width = r - l
            val minHeight = if (height[l] < height[r]) height[l++] else height[r--]
            result = result.coerceAtLeast(minHeight * width)
        }
        return result
    }

}