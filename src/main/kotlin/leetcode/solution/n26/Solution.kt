package leetcode.solution.n26

/**
 * [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var i = 1
        var current = nums[0]
        for (j in 1 until nums.size) {
            if (nums[j] != current) {
                current = nums[j]
                nums[i++] = current
            }
        }
        return i
    }
}