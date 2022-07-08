package leetcode.solution.n79

/**
 * [79. Word Search](https://leetcode.com/problems/word-search/)
 */
class Solution {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visited = Array(board.size) { BooleanArray(board[0].size) }
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board.exist(word, visited, i, j, 0)) return true
            }
        }
        return false
    }

    private fun Array<CharArray>.exist(word: String, visited: Array<BooleanArray>, i: Int, j: Int, c: Int): Boolean {
        if (visited[i][j] || this[i][j] != word[c]) return false
        if (c == word.length - 1) return true
        visited[i][j] = true
        if (i > 0 && exist(word, visited, i - 1, j, c + 1)
            || i < this.size - 1 && exist(word, visited, i + 1, j, c + 1)
            || j > 0 && exist(word, visited, i, j - 1, c + 1)
            || j < this[0].size - 1 && exist(word, visited, i, j + 1, c + 1)
        ) {
            return true
        }
        visited[i][j] = false
        return false
    }
}