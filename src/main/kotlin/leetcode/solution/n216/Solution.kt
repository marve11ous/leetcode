package leetcode.solution.n216

/**
 * [216. Combination Sum III](https://leetcode.com/problems/combination-sum-iii/)
 */
class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        combinationSum3(result, 0, IntArray(k) { 0 }, 0, k, n)
        return result
    }

    private fun combinationSum3(result: ArrayList<List<Int>>, i: Int, nums: IntArray, sum: Int, k: Int, n: Int) {
        val start = if (i == 0) 1 else nums[i - 1] + 1
        for (num in start..9) {
            nums[i] = num
            if (sum + num == n && i + 1 == k) {
                result.add(nums.toList())
                continue
            }
            if (sum + num < n && i + 1 < k) {
                combinationSum3(result, i + 1, nums, sum + num, k, n)
            }
        }
    }
}