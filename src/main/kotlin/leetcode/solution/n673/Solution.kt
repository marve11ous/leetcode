package leetcode.solution.n673

class Solution {
    private lateinit var nums: IntArray
    private lateinit var dp: Array<Pair<Int, Int>?>

    fun findNumberOfLIS(nums: IntArray): Int {
        if (nums.size < 2) {
            return nums.size
        }
        this.nums = nums
        dp = Array(nums.size) { null }
        var max = 0
        for (i in nums.indices) {
            max = max(max, dp(i).first)
        }
        return dp.filterNotNull().filter { it.first == max }.map { it.second }.sum()
    }

    private fun dp(n: Int): Pair<Int, Int> {
        val current = dp[n]
        if (current != null) {
            return current
        }
        var length = 1 to 1
        for (i in 0 until n) {
            if (nums[i] < nums[n]) {
                val next = dp(i)
                if (next.first + 1 > length.first) {
                    length = next.first + 1 to next.second
                } else if (next.first + 1 == length.first) {
                    length = length.first to (length.second + next.second)
                }
            }
        }
        dp[n] = length
        return length
    }

    private fun max(a: Int, b: Int) = if (a > b) a else b
}