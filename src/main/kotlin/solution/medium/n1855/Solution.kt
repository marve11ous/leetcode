package solution.medium.n1855

import kotlin.math.max

/**
 * [1855. Maximum Distance Between a Pair of Values](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/)
 */
class Solution {
    fun maxDistance(nums1: IntArray, nums2: IntArray): Int {
        var max = 0
        for (i in nums1.indices) {
            var l = i + max + 1
            var r = nums2.size - 1
            while (l <= r) {
                val j = l + (r - l) / 2
                if (nums1[i] <= nums2[j]) {
                    max = max(max, j - i)
                    l = j + 1
                } else {
                    r = j - 1
                }
            }
        }
        return max
    }
}