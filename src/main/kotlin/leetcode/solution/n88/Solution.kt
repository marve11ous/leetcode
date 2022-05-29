package leetcode.solution.n88

/**
 * [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
 */
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        if (n > 0) {
            var p1 = m - 1
            var p2 = n - 1
            for (i in n + m - 1 downTo 0) {
                nums1[i] = if (p2 < 0 || p1 >= 0 && nums1[p1] > nums2[p2]) nums1[p1--] else nums2[p2--]
            }
        }
    }
}