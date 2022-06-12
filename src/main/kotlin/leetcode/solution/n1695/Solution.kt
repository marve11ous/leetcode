package leetcode.solution.n1695

/**
 * [1695. Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
 */
class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        val set = HashSet<Int>()
        var l = 0
        var r = -1
        var result = 0
        var score = 0
        while (++r < nums.size) {
            if (set.contains(nums[r])) {
                while (nums[l++] != nums[r]) {
                    set.remove(nums[l - 1])
                    score -= nums[l - 1]
                }
            } else {
                set.add(nums[r])
                score += nums[r]
            }
            result = result.coerceAtLeast(score)
        }
        return result
    }
}