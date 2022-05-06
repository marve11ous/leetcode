package solution.medium.n73

/**
 * [73. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
 */
class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val zeroFirstColumn = matrix.any { it[0] == 0 }
        val zeroFirstRow = matrix[0].any { it == 0 }
        (1 until matrix.size).forEach { i ->
            (1 until matrix[i].size)
                .filter { matrix[i][it] == 0 }
                .forEach { j -> matrix[i][0] = 0; matrix[0][j] = 0 }
        }
        (1 until matrix.size)
            .filter { matrix[it][0] == 0 }
            .forEach { matrix.zeroRow(it, 1) }
        (1 until matrix[0].size)
            .filter { matrix[0][it] == 0 }
            .forEach { matrix.zeroColumn(it, 1) }
        if (zeroFirstColumn) matrix.zeroColumn(0)
        if (zeroFirstRow) matrix.zeroRow(0)
    }

    private fun Array<IntArray>.zeroRow(n: Int, start: Int = 0) {
        for (j in start until this[n].size) this[n][j] = 0
    }

    private fun Array<IntArray>.zeroColumn(n: Int, start: Int = 0) {
        for (i in start until this.size) this[i][n] = 0
    }
}