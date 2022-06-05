package leetcode.solution.n52

/**
 * [52. N-Queens II](https://leetcode.com/problems/n-queens-ii/)
 */
class Solution {
    fun totalNQueens(
        n: Int,
        i: Int = 0,
        columns: BooleanArray = BooleanArray(n),
        diagonals: BooleanArray = BooleanArray(4 * n - 2)
    ): Int {
        if (i == n) return 1
        val offset = 3 * n - 2
        var result = 0
        for (j in 0 until n) {
            if (!columns[j] && !diagonals[i + j] && !diagonals[i - j + offset]) {
                columns[j] = true
                diagonals[i + j] = true
                diagonals[i - j + offset] = true
                result += totalNQueens(n, i + 1, columns, diagonals)
                columns[j] = false
                diagonals[i + j] = false
                diagonals[i - j + offset] = false
            }
        }
        return result
    }
}