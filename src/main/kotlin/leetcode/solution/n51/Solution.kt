package leetcode.solution.n51


/**
 * [51. N-Queens](https://leetcode.com/problems/n-queens/)
 */
class Solution {

    fun solveNQueens(n: Int): List<List<String>> {
        val result = ArrayList<List<String>>()
        solveNQueens(
            result,
            0,
            board = Array(n) { CharArray(n) { '.' } },
            columns = BooleanArray(n),
            diagonals = BooleanArray(4 * n - 2)
        )
        return result
    }

    private fun solveNQueens(
        result: ArrayList<List<String>>,
        i: Int,
        board: Array<CharArray>,
        columns: BooleanArray,
        diagonals: BooleanArray
    ) {
        val offset = 3 * board.size - 2
        for (j in board.indices) {
            if (!columns[j] && !diagonals[i + j] && !diagonals[i - j + offset]) {
                board[i][j] = 'Q'
                columns[j] = true
                diagonals[i + j] = true
                diagonals[i - j + offset] = true
                if (i + 1 < board.size) {
                    solveNQueens(result, i + 1, board, columns, diagonals)
                } else {
                    result.add(board.map { it.joinToString(separator = "") })
                }
                board[i][j] = '.'
                columns[j] = false
                diagonals[i + j] = false
                diagonals[i - j + offset] = false
            }
        }
    }
}