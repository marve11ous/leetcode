package leetcode.solution.n376

/**
 * [376. Wiggle Subsequence](https://leetcode.com/problems/wiggle-subsequence/)
 */
class Solution {
    fun wiggleMaxLength(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var result = 0
        val inc = IntArray(nums.size)
        val dec = IntArray(nums.size)
        for (i in 1 until nums.size) {
            for (j in 0 until i) {
                when {
                    nums[i] > nums[j] -> inc[i] = inc[i].coerceAtLeast(dec[j] + 1)
                    nums[i] < nums[j] -> dec[i] = dec[i].coerceAtLeast(inc[j] + 1)
                }
            }
            result = result.coerceAtLeast(dec[i]).coerceAtLeast(inc[i])
        }
        return result + 1
    }
}