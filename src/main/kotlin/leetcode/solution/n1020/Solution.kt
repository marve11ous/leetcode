package leetcode.solution.n1020

import java.util.*

/**
 * [1020. Number of Enclaves](https://leetcode.com/problems/number-of-enclaves/)
 */
class Solution {
    fun numEnclaves(grid: Array<IntArray>): Int {
        val stack = LinkedList<Pair<Int, Int>>()
        val visited = Array(grid.size) { BooleanArray(grid[0].size) }
        var result = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (visited[i][j] || grid[i][j] == 0) continue
                stack.push(i to j)
                var exit = false
                var size = 0
                while (stack.isNotEmpty()) {
                    val (k, l) = stack.pop()
                    if (visited[k][l]) continue
                    size++
                    visited[k][l] = true
                    if (k == 0 || l == 0 || k == grid.size - 1 || l == grid[0].size - 1) exit = true
                    stack.push(k - 1 to l, grid, visited)
                    stack.push(k + 1 to l, grid, visited)
                    stack.push(k to l - 1, grid, visited)
                    stack.push(k to l + 1, grid, visited)
                }
                if (!exit) result += size
            }
        }
        return result
    }

    private fun LinkedList<Pair<Int, Int>>.push(
        point: Pair<Int, Int>,
        grid: Array<IntArray>,
        visited: Array<BooleanArray>
    ) {
        if (point.first in grid.indices
            && point.second in grid[0].indices
            && !visited[point.first][point.second]
            && grid[point.first][point.second] == 1
        ) push(point)
    }
}