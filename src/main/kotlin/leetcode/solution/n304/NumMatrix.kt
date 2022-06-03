package leetcode.solution.n304

/**
 * [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)
 */
class NumMatrix(private val matrix: Array<IntArray>) {

    private val cache = Array(matrix.size) { IntArray(matrix[0].size + 1) }.apply {
        for (i in matrix.indices) {
            var prev = 0
            for (j in matrix[0].indices) {
                this[i][j] = prev + matrix[i][j]
                prev = this[i][j]
                if (i > 0) this[i][j] += this[i - 1][j]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var result = cache[row2][col2]
        if (row1 > 0 && col1 > 0) result += cache[row1 - 1][col1 - 1]
        if (row1 > 0) result -= cache[row1 - 1][col2]
        if (col1 > 0) result -= cache[row2][col1 - 1]
        return result
    }

}
