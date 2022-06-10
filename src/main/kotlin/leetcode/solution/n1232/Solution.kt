package leetcode.solution.n1232

/**
 * [1232. Check If It Is a Straight Line](https://leetcode.com/problems/check-if-it-is-a-straight-line/)
 */
class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val first = coordinates[0]
        val second = coordinates[1]
        for (i in 2 until coordinates.size) {
            val third = coordinates[i]
            if ((first[0] - third[0]) * (first[1] - second[1]) != (first[0] - second[0]) * (first[1] - third[1])) {
                return false
            }
        }
        return true
    }
}