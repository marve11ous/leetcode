package leetcode.solution.n33

/**
 * [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
 */
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        for (i in 0 until nums.size - 1) {
            if (nums[i + 1] < nums[i]) {
                if (target in nums[0]..nums[i]) {
                    r = i
                } else {
                    l = i + 1
                    r = nums.size - 1
                }
            }
        }
        while (l < r) {
            val mid = l + (r - l) / 2
            if (nums[mid] < target) l = mid + 1 else r = mid
        }
        return if (nums[l] == target) l else -1
    }
}