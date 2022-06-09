package leetcode.solution.n1254

import java.util.*

/**
 * [1254. Number of Closed Islands](https://leetcode.com/problems/number-of-closed-islands/)
 */
class Solution {
    fun closedIsland(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        val stack = LinkedList<Pair<Int, Int>>()
        var result = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (visited[i][j] || grid[i][j] == 1) continue
                stack.push(i to j)
                var closed = true
                while (stack.isNotEmpty()) {
                    val (k, l) = stack.pop()
                    visited[k][l] = true
                    if (k == 0 || k == grid.size - 1 || l == 0 || l == grid[0].size - 1) {
                        closed = false
                    }
                    if (k < grid.size - 1 && grid[k + 1][l] == 0 && !visited[k + 1][l]) stack.push(k + 1 to l)
                    if (k > 0 && grid[k - 1][l] == 0 && !visited[k - 1][l]) stack.push(k - 1 to l)
                    if (l > 0 && grid[k][l - 1] == 0 && !visited[k][l - 1]) stack.push(k to l - 1)
                    if (l < grid[0].size - 1 && grid[k][l + 1] == 0 && !visited[k][l + 1]) stack.push(k to l + 1)
                }
                if (closed) result++
            }
        }
        return result
    }
}