package leetcode.solution.n48

/**
 * [48. Rotate Image](https://leetcode.com/problems/rotate-image/)
 */
class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n = matrix.size - 1
        for (i in 0..n / 2) {
            for (j in 0..(n - 1) / 2) {
                val v = matrix[n - j][i]
                matrix[n - j][i] = matrix[n - i][n - j]
                matrix[n - i][n - j] = matrix[j][n - i]
                matrix[j][n - i] = matrix[i][j]
                matrix[i][j] = v
            }
        }
    }
}