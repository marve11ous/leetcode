package solution.medium.n2270

/**
 * [2270. Number of Ways to Split Array](https://leetcode.com/problems/number-of-ways-to-split-array/)
 */
class Solution {
    fun waysToSplitArray(nums: IntArray): Int {
        var result = 0
        var left = 0L
        var right = nums.sumOf { it.toLong() }
        for (i in 0 until nums.size - 1) {
            left += nums[i]
            right -= nums[i]
            if (left >= right) result++
        }
        return result
    }
}