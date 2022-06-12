package leetcode.solution.n1608

/**
 * [1608. Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)
 */
class Solution {
    fun specialArray(nums: IntArray): Int {
        var l = 1
        var r = nums.size
        while (l <= r) {
            val mid = l + (r - l) / 2
            val count = nums.count { it >= mid }
            when {
                count == mid -> return mid
                count > mid -> l = mid + 1
                else -> r = mid - 1
            }
        }
        return -1
    }

}