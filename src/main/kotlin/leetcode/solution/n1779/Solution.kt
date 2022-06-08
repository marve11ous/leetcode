package leetcode.solution.n1779

import kotlin.math.abs

/**
 * [1779. Find Nearest Point That Has the Same X or Y Coordinate](https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/)
 */
class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var dist = Int.MAX_VALUE
        var result = -1
        for (i in points.indices) {
            val dx = abs(x - points[i][0])
            val dy = abs(y - points[i][1])
            if ((dx == 0 || dy == 0) && dx + dy < dist) {
                dist = dx + dy
                result = i
            }
        }
        return result
    }
}