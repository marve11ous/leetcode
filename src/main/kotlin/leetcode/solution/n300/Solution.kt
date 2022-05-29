package leetcode.solution.n300

class Solution {

    private lateinit var nums: IntArray
    private lateinit var dp: IntArray

    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.size < 2) {
            return nums.size
        }
        this.nums = nums
        this.dp = IntArray(nums.size)
        var result = 1
        for (n in 1 until nums.size) {
            result = max(result, dp(n))
        }
        return result
    }

    private fun dp(n: Int): Int {
        if (n == 0) return 1
        if (dp[n] != 0) return dp[n]
        var result = 0
        for (i in 0 until n) {
            if (nums[n] > nums[i]) {
                result = max(result, dp(i))
            }
        }
        dp[n] = result + 1
        return dp[n]
    }

    private fun max(a: Int, b: Int) = if (a < b) b else a
}