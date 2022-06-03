package leetcode.solution.n994

import java.util.*

/**
 * [994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)
 */
class Solution {
    fun orangesRotting(grid: Array<IntArray>): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        var freshCount = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                when (grid[i][j]) {
                    2 -> queue.offer(i to j)
                    1 -> freshCount++
                }
            }
        }
        var result = 0
        var first = true
        while (queue.isNotEmpty()) {
            var size = queue.size
            var rottenCount = 0
            while (size-- > 0) {
                val (i, j) = queue.poll()
                if (grid[i][j] == 2 && !first) continue
                if (!first) {
                    grid[i][j] = 2
                    rottenCount++
                }
                if (i > 0 && grid[i - 1][j] == 1) queue.offer(i - 1 to j)
                if (i < grid.size - 1 && grid[i + 1][j] == 1) queue.offer(i + 1 to j)
                if (j > 0 && grid[i][j - 1] == 1) queue.offer(i to j - 1)
                if (j < grid[0].size - 1 && grid[i][j + 1] == 1) queue.offer(i to j + 1)
            }
            if (rottenCount > 0) result++
            freshCount -= rottenCount
            first = false
        }
        return if (freshCount == 0) result else -1
    }
}