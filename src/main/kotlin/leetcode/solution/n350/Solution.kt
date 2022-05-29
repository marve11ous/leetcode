package leetcode.solution.n350

import kotlin.math.min

/**
 * [350. Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/)
 */
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val numsMap1 = HashMap<Int, Int>()
        val numsMap2 = HashMap<Int, Int>()
        nums1.forEach { numsMap1.compute(it) { _, v -> (v ?: 0) + 1 } }
        nums2.forEach { numsMap2.compute(it) { _, v -> (v ?: 0) + 1 } }
        val result = ArrayList<Int>()
        numsMap1.forEach { (num, cnt1) ->
            val cnt2 = numsMap2[num] ?: 0
            repeat(min(cnt1, cnt2)) { result.add(num) }
        }
        return result.toIntArray()
    }
}