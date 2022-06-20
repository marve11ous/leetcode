package leetcode.solution.n365

/**
 * [365. Water and Jug Problem](https://leetcode.com/problems/water-and-jug-problem/)
 */
class Solution {
    fun canMeasureWater(jug1Capacity: Int, jug2Capacity: Int, targetCapacity: Int): Boolean {
        var jug1 = jug1Capacity
        var jug2 = jug2Capacity
        if (jug1 + jug2 < targetCapacity) return false
        while (jug2 > 0) {
            val temp = jug2
            jug2 = jug1 % jug2
            jug1 = temp
        }
        return targetCapacity % jug1 == 0
    }
}