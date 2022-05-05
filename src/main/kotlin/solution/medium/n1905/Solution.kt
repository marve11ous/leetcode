package solution.medium.n1905

/**
 * [1905. Count Sub Islands](https://leetcode.com/problems/count-sub-islands/)
 */
class Solution {
    fun countSubIslands(grid1: Array<IntArray>, grid2: Array<IntArray>): Int {
        val visited = Array(grid2.size) { BooleanArray(grid2[0].size) }
        var result = 0
        for (i in grid1.indices) {
            for (j in grid1[0].indices) {
                if (grid2[i][j] == 0 || visited[i][j]) continue
                if (isIsland(i, j, grid1, grid2, visited)) result++
            }
        }
        return result
    }

    private fun isIsland(
        i: Int, j: Int,
        grid1: Array<IntArray>, grid2: Array<IntArray>,
        visited: Array<BooleanArray>
    ): Boolean {
        if (i in grid2.indices && j in grid2[0].indices && grid2[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true
            return listOf(i - 1 to j, i + 1 to j, i to j - 1, i to j + 1)
                .map { isIsland(it.first, it.second, grid1, grid2, visited) }
                .reduce { b1, b2 -> b1 && b2 }
                    && grid1[i][j] == 1
        }
        return true
    }
}