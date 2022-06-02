package leetcode.solution.n1567

import kotlin.math.min

/**
 * [1567. Maximum Length of Subarray With Positive Product](https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/)
 */
class Solution {
    fun getMaxLen(nums: IntArray): Int {
        var result = 0
        var left = 0
        var firstNegative = -1
        var lastNegative = -1
        var isNegative = false
        for (i in nums.indices) {
            if (nums[i] < 0) {
                isNegative = !isNegative
                if (firstNegative < 0) firstNegative = i
                lastNegative = i
            }
            if (nums[i] == 0 || i == nums.size - 1) {
                val right = if (nums[i] != 0) i + 1 else i
                val offset = if (isNegative) min(firstNegative - left + 1, right - lastNegative) else 0
                result = result.coerceAtLeast(right - left - offset)
                left = i + 1
                firstNegative = -1
                lastNegative = -1
                isNegative = false
            }
        }
        return result
    }
}