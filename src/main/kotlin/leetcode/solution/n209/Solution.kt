package leetcode.solution.n209

/**
 * [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
 */
class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var l = 0
        var result = Int.MAX_VALUE
        for (r in nums.indices) {
            sum += nums[r]
            if (sum >= target) {
                while (sum - nums[l] >= target) sum -= nums[l++]
                result = result.coerceAtMost(r - l + 1)
            }
        }
        return if (result == Int.MAX_VALUE) 0 else result
    }
}