package leetcode.solution.n695

import java.util.*

/**
 * [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/)
 */
class Solution {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val queue = LinkedList<Pair<Int, Int>>()
        var result = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 0 || visited[i][j]) continue
                queue.offer(i to j)
                var s = 0
                while (queue.isNotEmpty()) {
                    val (k, l) = queue.poll()
                    if (visited[k][l]) continue
                    visited[k][l] = true
                    s++
                    if (k > 0 && grid[k - 1][l] == 1 && !visited[k - 1][l]) queue.offer(k - 1 to l)
                    if (k < grid.size - 1 && grid[k + 1][l] == 1 && !visited[k + 1][l]) queue.offer(k + 1 to l)
                    if (l > 0 && grid[k][l - 1] == 1 && !visited[k][l - 1]) queue.offer(k to l - 1)
                    if (l < grid[0].size - 1 && grid[k][l + 1] == 1 && !visited[k][l + 1]) queue.offer(k to l + 1)
                }
                result = result.coerceAtLeast(s)
            }
        }
        return result
    }
}