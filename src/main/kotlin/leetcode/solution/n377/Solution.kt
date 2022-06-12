package leetcode.solution.n377

/**
 * [377. Combination Sum IV](https://leetcode.com/problems/combination-sum-iv/)
 */
class Solution {
    fun combinationSum4(nums: IntArray, target: Int): Int {
        return combinationSum4(IntArray(target + 1) { if (it == 0) 1 else -1 }, nums, target)
    }

    private fun combinationSum4(dp: IntArray, nums: IntArray, target: Int): Int {
        if (dp[target] < 0) {
            dp[target] = 0
            nums.filter { target >= it }.forEach { dp[target] += combinationSum4(dp, nums, target - it) }
        }
        return dp[target]
    }
}