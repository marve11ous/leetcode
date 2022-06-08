package leetcode.solution.n1385

import kotlin.math.abs

/**
 * [1385. Find the Distance Value Between Two Arrays](https://leetcode.com/problems/find-the-distance-value-between-two-arrays/)
 */
class Solution {
    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        return arr1.count { a1 -> arr2.all { abs(a1 - it) > d } }
    }
}