package leetcode.solution.n1162

import java.util.*

/**
 * [1162. As Far from Land as Possible](https://leetcode.com/problems/as-far-from-land-as-possible/)
 */
class Solution {
    fun maxDistance(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val queue = LinkedList<Pair<Int, Int>>()
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1) queue.offer(i to j)
            }
        }
        var result = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            var anyVisited = false
            while (size-- > 0) {
                val (x, y) = queue.poll()
                if (visited[x][y]) continue
                if (grid[x][y] == 0) anyVisited = true
                visited[x][y] = true
                if (x > 0 && grid[x - 1][y] == 0 && !visited[x - 1][y]) queue.offer(x - 1 to y)
                if (x < grid.size - 1 && grid[x + 1][y] == 0 && !visited[x + 1][y]) queue.offer(x + 1 to y)
                if (y > 0 && grid[x][y - 1] == 0 && !visited[x][y - 1]) queue.offer(x to y - 1)
                if (y < grid[0].size - 1 && grid[x][y + 1] == 0 && !visited[x][y + 1]) queue.offer(x to y + 1)
            }
            if (anyVisited) result++
        }
        return if (result == 0) -1 else result
    }

}