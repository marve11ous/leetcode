package solution.easy.n283

/**
 * [283. Move Zeroes](https://leetcode.com/problems/move-zeroes/)
 */
class Solution {
    fun moveZeroes(nums: IntArray) {
        var i = 0
        nums.filter { it != 0 }.forEach { nums[i++] = it }
        while (i < nums.size) nums[i++] = 0
    }
}