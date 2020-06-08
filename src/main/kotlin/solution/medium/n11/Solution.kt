package solution.medium.n11

class Solution {
    fun maxArea(height: IntArray): Int {
        var result = 0
        var left = 0
        var right = height.size - 1
        while (left < right) {
            val s = min(height[left], height[right]) * (right - left)
            if (result < s) {
                result = s
            }
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return result
    }

    private fun min(a: Int, b: Int) = if (a < b) a else b
}