package leetcode.solution.n1091

import java.util.*

/**
 * [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
 */
class Solution {
    private companion object {
        private val directions = listOf(1 to 0, 1 to 1, 1 to -1, 0 to 0, 0 to 1, 0 to -1, -1 to 0, -1 to 1, -1 to -1)
    }

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        val n = grid.size - 1
        if (grid[0][0] == 0 && grid[n][n] == 0) queue.offer(0 to 0)
        var length = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, j) = queue.pop()
                if (i == n && j == n) return length
                directions
                    .map { i + it.first to j + it.second }
                    .filter { (r, c) -> r in grid.indices && c in grid.indices && grid[r][c] == 0 }
                    .forEach {
                        grid[it.first][it.second] = 1
                        queue.offer(it)
                    }
            }
            length++
        }
        return -1
    }

}