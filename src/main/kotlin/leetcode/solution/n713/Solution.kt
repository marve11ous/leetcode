package leetcode.solution.n713

/**
 * [713. Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/)
 */
class Solution {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        if (k <= 1) return 0
        var result = 0
        var prod = 1
        var l = 0
        for (r in nums.indices) {
            prod *= nums[r]
            while (prod >= k) prod /= nums[l++]
            result += r - l + 1
        }
        return result
    }
}