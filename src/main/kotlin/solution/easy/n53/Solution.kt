package solution.easy.n53

class Solution {
    private lateinit var nums: IntArray
    private lateinit var dp: IntArray

    fun maxSubArray(nums: IntArray): Int {
        this.nums = nums
        this.dp = IntArray(nums.size)
        dp[0] = nums[0]
        for (i in 1 until nums.size) {
            dp[i] = if (dp[i - 1] > 0) nums[i] + dp[i - 1] else nums[i]
        }
        return dp.maxOrNull() ?: 0
    }

}