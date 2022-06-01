package leetcode.solution.n152

/**
 * [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
 */
class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max = nums[0]
        var min = nums[0]
        var result = nums[0]

        for (i in 1 until nums.size) {
            if (nums[i] < 0) {
                val temp = max
                max = min
                min = temp
            }
            max = nums[i].coerceAtLeast(nums[i] * max)
            min = nums[i].coerceAtMost(nums[i] * min)
            result = result.coerceAtLeast(max)
        }
        return result
    }
}