package leetcode.solution.n873

class Solution {

    private lateinit var nums: IntArray
    private lateinit var dp: Array<IntArray>

    fun lenLongestFibSubseq(nums: IntArray): Int {
        if (nums.size < 2) {
            return 0
        }
        this.nums = nums
        this.dp = Array(nums.size) { IntArray(nums.size) }
        var result = 0
        for (n in 2 until nums.size) {
            var maxLength = 0
            for (i in 0 until n - 1) {
                for (j in i + 1 until n) {
                    if (nums[n] == nums[i] + nums[j]) {
                        val next = max(2, dp[j][i])
                        if (next > maxLength) {
                            maxLength = next
                        }
                        dp[n][j] = next + 1
                    }
                }
            }
            result = max(result, dp[n].maxOrNull() ?: 0)
        }
        return result
    }

    private fun max(a: Int, b: Int) = if (a < b) b else a
}