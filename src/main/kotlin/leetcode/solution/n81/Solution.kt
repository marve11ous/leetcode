package leetcode.solution.n81

/**
 * [81. Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 */
class Solution {
    fun search(nums: IntArray, target: Int): Boolean {
        if (nums.isEmpty()) return false
        if (nums[0] == target) return true
        if (nums[0] < target) {
            for (i in 1 until nums.size) {
                if (nums[i] == target) return true
                if (nums[i] > target || nums[i] < nums[i - 1]) return false
            }
        } else {
            for (i in nums.size - 1 downTo 1) {
                if (nums[i] == target) return true
                if (nums[i] < target || nums[i] < nums[i - 1]) return false
            }
        }
        return false
    }
}