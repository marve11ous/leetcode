package leetcode.solution.n27

/**
 * [27. Remove Element](https://leetcode.com/problems/remove-element/)
 */
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var offset = 0
        nums.forEachIndexed { i, num -> if (num == `val`) offset++ else if (offset > 0) nums[i - offset] = num }
        return nums.size - offset
    }
}