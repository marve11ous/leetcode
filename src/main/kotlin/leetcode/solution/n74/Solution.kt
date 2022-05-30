package leetcode.solution.n74

/**
 * [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
 */
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var l = 0
        var r = matrix.size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (matrix[mid].last() < target) l = mid + 1 else r = mid
        }
        val i = l
        l = 0
        r = matrix[0].size - 1
        while (l < r) {
            val mid = l + (r - l) / 2
            if (matrix[i][mid] < target) l = mid + 1 else r = mid
        }
        return matrix[i][l] == target
    }
}