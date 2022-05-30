package leetcode.solution.n36

/**
 * [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)
 */
class Solution {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (!board.isValid(board.indices, board[0].indices)) return false
        if (!board.isValid(board.indices, board[0].indices, reverse = true)) return false
        var k = 0
        var l = 0
        while (k < 9) {
            if (!board.isValid(k until k + 3, l until l + 3, clear = false)) return false
            l = (l + 3) % 9
            if (l == 0) k += 3
        }
        return true
    }

    private fun Array<CharArray>.isValid(
        iRange: IntRange,
        jRange: IntRange,
        reverse: Boolean = false,
        clear: Boolean = true
    ): Boolean {
        val hashSet = HashSet<Char>()
        for (i in iRange) {
            for (j in jRange) {
                val c = if (reverse) this[j][i] else this[i][j]
                if (c != '.') {
                    if (hashSet.contains(c)) return false
                    hashSet.add(c)
                }
            }
            if (clear) hashSet.clear()
        }
        return true
    }

}