package leetcode.solution.n130

/**
 * [130. Surrounded Regions](https://leetcode.com/problems/surrounded-regions/)
 */
class Solution {
    fun solve(board: Array<CharArray>) {
        for (i in board.indices) {
            if (board[i][0] == 'O') board.dfs(i, 0)
            if (board[i].last() == 'O') board.dfs(i, board[0].size - 1)
        }

        for (j in board[0].indices) {
            if (board[0][j] == 'O') board.dfs(0, j)
            if (board.last()[j] == 'O') board.dfs(board.size - 1, j)
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                board[i][j] = if (board[i][j] == 'N') 'O' else 'X'
            }
        }
    }

    private fun Array<CharArray>.dfs(i: Int, j: Int) {
        this[i][j] = 'N'
        if (i > 0 && this[i - 1][j] == 'O') dfs(i - 1, j)
        if (i < size - 1 && this[i + 1][j] == 'O') dfs(i + 1, j)
        if (j > 0 && this[i][j - 1] == 'O') dfs(i, j - 1)
        if (j < this[0].size - 1 && this[i][j + 1] == 'O') dfs(i, j + 1)
    }
}