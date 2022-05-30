package leetcode.solution.n918

/**
 * [918. Maximum Sum Circular Subarray](https://leetcode.com/problems/maximum-sum-circular-subarray/)
 */
class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var result = nums[0]
        var sum = nums[0]
        for (i in 1 until nums.size) {
            sum = nums[i] + sum.coerceAtLeast(0)
            result = result.coerceAtLeast(sum)
        }

        sum = nums.last()
        val dp = IntArray(nums.size)
        dp[nums.size - 1] = sum
        for (i in nums.size - 2 downTo 0) {
            sum += nums[i]
            dp[i] = dp[i + 1].coerceAtLeast(sum)
        }

        sum = 0
        for (i in 0 until nums.size - 2) {
            sum += nums[i]
            result = result.coerceAtLeast(sum + dp[i + 2])
        }

        return result
    }
}