package leetcode.solution.n413

/**
 * [413. Arithmetic Slices](https://leetcode.com/problems/arithmetic-slices/)
 */
class Solution {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        var result = 0
        var length = 0
        for (i in 2 until nums.size) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                result += ++length
            } else {
                length = 0
            }
        }
        return result
    }
}