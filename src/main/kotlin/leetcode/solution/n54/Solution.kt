package leetcode.solution.n54

import java.util.LinkedList

/**
 * [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)
 */
class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var di = 0
        var dj = 1
        val result = LinkedList<Int>()
        var i = 0
        var j = 0
        var li = 1
        var lj = 0
        var ri = matrix.size - 1
        var rj = matrix[0].size - 1
        if (rj == 0) {
            di = 1
            dj = 0
        }
        while (result.size < matrix.size * matrix[0].size) {
            result.add(matrix[i][j])
            i += di
            j += dj
            when {
                dj > 0 && j == rj -> {
                    rj--
                    di = 1
                    dj = 0
                }
                di > 0 && i == ri -> {
                    ri--
                    di = 0
                    dj = -1
                }
                dj < 0 && j == lj -> {
                    lj++
                    di = -1
                    dj = 0
                }
                di < 0 && i == li -> {
                    li++
                    di = 0
                    dj = 1
                }
            }
        }
        return result
    }
}