package leetcode.solution.n1658

/**
 * [1658. Minimum Operations to Reduce X to Zero](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/)
 */
class Solution {
    fun minOperations(nums: IntArray, x: Int): Int {
        val y = nums.sum() - x
        if (y < 0) return -1
        if (y == 0) return nums.size
        var l = 0
        var r = 0
        var sum = 0
        var max = 0
        while (r < nums.size) {
            sum += nums[r++]
            while (sum > y) sum -= nums[l++]
            if (sum == y) max = max.coerceAtLeast(r - l)
        }
        return if (max == 0) -1 else (nums.size - max)
    }
}