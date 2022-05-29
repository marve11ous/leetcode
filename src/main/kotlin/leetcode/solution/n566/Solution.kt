package leetcode.solution.n566

/**
 * [566. Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
 */
class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) return mat
        val result = Array(r) { IntArray(c) }
        var i = 0
        var j = 0
        mat.forEach { row ->
            row.forEach {
                result[i][j] = it
                if (++j == c) {
                    j = 0
                    i++
                }
            }
        }
        return result
    }
}