package leetcode.solution.n34

/**
 * [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var l = 0
        var r = nums.size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (nums[mid] < target) l = mid + 1 else r = mid
        }
        if (l >= nums.size || nums[l] != target) return intArrayOf(-1, -1)
        val first = l
        r = nums.size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (nums[mid + 1] == target) l = mid + 1 else r = mid
        }
        return intArrayOf(first, l)
    }
}