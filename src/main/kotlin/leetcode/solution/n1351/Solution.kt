package leetcode.solution.n1351

/**
 * [1351. Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
 */
class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var result = 0
        var i = 0
        var j = grid[0].size - 1
        while (i < grid.size && j >= 0) {
            if (grid[i][j] < 0) {
                j--
                result += grid.size - i
            } else {
                i++
            }
        }
        return result
    }
}