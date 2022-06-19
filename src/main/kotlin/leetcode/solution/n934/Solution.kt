package leetcode.solution.n934

import java.util.LinkedList

/**
 * [934. Shortest Bridge](https://leetcode.com/problems/shortest-bridge/)
 */
class Solution {
    fun shortestBridge(grid: Array<IntArray>): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        main@for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) {
                    queue.add(i to j)
                    break@main
                }
            }
        }

        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        while (queue.isNotEmpty()) {
            val (i, j) = queue.poll()
            if (visited[i][j]) continue
            visited[i][j] = true
            if (i > 0 && !visited[i - 1][j] && grid[i - 1][j] == 1) queue.offer(i - 1 to j)
            if (i < grid.size - 1 && !visited[i + 1][j] && grid[i + 1][j] == 1) queue.offer(i + 1 to j)
            if (j > 0 && !visited[i][j - 1] && grid[i][j - 1] == 1) queue.offer(i to j - 1)
            if (j < grid[0].size - 1 && !visited[i][j + 1] && grid[i][j + 1] == 1) queue.offer(i to j + 1)
        }

        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (visited[i][j]) queue.add(i to j)
            }
        }

        val visited2 = Array(grid.size) { BooleanArray(grid[0].size) }
        var deep = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, j) = queue.poll()
                if (visited2[i][j]) continue
                visited2[i][j] = true
                if (
                    i > 0 && !visited[i - 1][j] && grid[i - 1][j] == 1
                    || i < grid.size - 1 && !visited[i + 1][j] && grid[i + 1][j] == 1
                    || j > 0 && !visited[i][j - 1] && grid[i][j - 1] == 1
                    || j < grid[0].size - 1 && !visited[i][j + 1] && grid[i][j + 1] == 1
                )
                    return deep

                if (i > 0 && !visited2[i - 1][j] && grid[i - 1][j] == 0) queue.offer(i - 1 to j)
                if (i < grid.size - 1 && !visited2[i + 1][j] && grid[i + 1][j] == 0) queue.offer(i + 1 to j)
                if (j > 0 && !visited2[i][j - 1] && grid[i][j - 1] == 0) queue.offer(i to j - 1)
                if (j < grid[0].size - 1 && !visited2[i][j + 1] && grid[i][j + 1] == 0) queue.offer(i to j + 1)
            }
            deep++
        }
        return -1
    }
}