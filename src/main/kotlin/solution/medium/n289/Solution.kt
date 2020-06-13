package solution.medium.n289

/**
 * 289. Game of Life
 *
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised
 * by the British mathematician John Horton Conway in 1970."
 *
 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its
 * eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia
 * article):
 * 1. Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * 2. Any live cell with two or three live neighbors lives on to the next generation.
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 *
 * Write a function to compute the next state (after one update) of the board given its current state.
 * The next state is created by applying the above rules simultaneously to every cell in the current state, where births
 * and deaths occur simultaneously.
 */
class Solution {
    fun gameOfLife(board: Array<IntArray>) {
        val live = HashMap<Int, HashSet<Int>>()
        for ((i, line) in board.withIndex()) {
            for ((j, cell) in line.withIndex()) {
                val isLive = cell == 1
                val liveNeighbors = getLiveNeighbors(i, j, board)
                if (isLive && liveNeighbors in 2..3 || !isLive && liveNeighbors == 3) {
                    live.computeIfAbsent(i) { HashSet() }.add(j)
                }
            }
        }
        for (i in board.indices) {
            val liveSet = live[i]?: emptySet()
            for (j in board[i].indices) {
                board[i][j] = if (liveSet.contains(j)) 1 else 0
            }
        }
    }

    private fun getLiveNeighbors(i: Int, j: Int, board: Array<IntArray>): Int {
        var cnt = 0
        for (k in i - 1..i + 1) {
            if (k in board.indices) {
                for (l in j - 1..j + 1) {
                    if ((k != i || l != j) && l in board [0].indices && board[k][l] == 1) {
                        cnt++
                    }
                }
            }
        }
        return cnt
    }

}