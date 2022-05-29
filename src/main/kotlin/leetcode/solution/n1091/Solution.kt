package leetcode.solution.n1091

import java.util.*

/**
 * [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
 */
class Solution {

    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        if (grid[0][0] == 0 && grid[grid.size - 1][grid.size - 1] == 0) queue.offer(0 to 0)
        var length = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, j) = queue.pop()
                if (i == grid.size - 1 && j == i) {
                    return length
                }
                listOf(
                    i - 1 to j,
                    i - 1 to j + 1,
                    i - 1 to j - 1,
                    i to j + 1,
                    i to j - 1,
                    i + 1 to j,
                    i + 1 to j + 1,
                    i + 1 to j - 1
                )
                    .filter { it.first in grid.indices && it.second in grid.indices && grid[it.first][it.second] == 0 }
                    .forEach { grid[it.first][it.second] = 1; queue.offer(it) }
            }
            length++
        }
        return -1
    }

}