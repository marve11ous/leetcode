package leetcode.solution.n1710

import kotlin.math.min

/**
 * [1710. Maximum Units on a Truck](https://leetcode.com/problems/maximum-units-on-a-truck/)
 */
class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        boxTypes.sortByDescending { it[1] }
        var left = truckSize
        var result = 0
        for (i in boxTypes.indices) {
            val count = min(left, boxTypes[i][0])
            result += boxTypes[i][1] * count
            if (left == count) break
            left -= count
        }
        return result
    }
}