package solution.medium.n167

/**
 * [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var l = 0
        var r = nums.size - 1
        while (l < r) {
            val sum = nums[l] + nums[r]
            when {
                sum < target -> l++
                sum > target -> r--
                else -> return intArrayOf(l + 1, r + 1)
            }
        }
        return intArrayOf()
    }
}