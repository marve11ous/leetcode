package leetcode.solution.n417

import java.util.*

/**
 * [417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)
 */
class Solution {
    private val directions = listOf(0 to -1, 0 to 1, 1 to 0, -1 to 0)

    fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
        val visited = Array(heights.size) { IntArray(heights[0].size) }
        val queue = LinkedList<Pair<Int, Int>>()
        queue.search(0, 0, heights, visited, 1)

        val result = ArrayList<List<Int>>()
        queue.search(heights.size - 1, heights[0].size - 1, heights, visited, -1)
        { i, j -> if (visited[i][j] == 1) result.add(listOf(i, j)) }

        return result
    }

    private fun LinkedList<Pair<Int, Int>>.search(
        row: Int,
        col: Int,
        heights: Array<IntArray>,
        visited: Array<IntArray>,
        visit: Int,
        collect: (i: Int, j: Int) -> Unit = { _, _ -> }
    ) {
        heights.indices.forEach { offer(it to col) }
        heights[0].indices.forEach { offer(row to it) }
        while (isNotEmpty()) {
            val (i, j) = poll()
            collect(i, j)
            if (visited[i][j] == visit) continue
            visited[i][j] = visit
            directions
                .filter { i + it.first in heights.indices }
                .filter { j + it.second in heights[0].indices }
                .filter { visited[i + it.first][j + it.second] != visit }
                .filter { heights[i + it.first][j + it.second] >= heights[i][j] }
                .forEach { offer(i + it.first to j + it.second) }
        }
    }
}