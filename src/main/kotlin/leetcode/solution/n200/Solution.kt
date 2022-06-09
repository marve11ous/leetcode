package leetcode.solution.n200

import java.util.*

/**
 * [200. Number of Islands](https://leetcode.com/problems/number-of-islands/submissions/)
 */
class Solution {

    private companion object {
        private val directions = listOf(0 to 1, 1 to 0, -1 to 0, 0 to -1)
    }

    fun numIslands(grid: Array<CharArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val stack = LinkedList<Pair<Int, Int>>()
        var result = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (visited[i][j] || grid[i][j] == '0') continue
                stack.push(i to j)
                while (stack.isNotEmpty()) {
                    val (x, y) = stack.pop()
                    visited[x][y] = true
                    directions.forEach { (dx, dy) ->
                        if (x + dx in grid.indices && y + dy in grid[0].indices
                            && grid[x + dx][y + dy] == '1' && !visited[x + dx][y + dy]
                        ) {
                            stack.push(x + dx to y + dy)
                        }
                    }
                }
                result++
            }
        }
        return result
    }
}