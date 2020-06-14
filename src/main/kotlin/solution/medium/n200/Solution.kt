package solution.medium.n200

/**
 * 200. Number of Islands
 *
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water
 * and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are
 * all surrounded by water.
 */
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var result = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    visit(i, j, grid)
                    result++
                }
            }
        }
        return result
    }

    private fun visit(i: Int, j: Int, grid: Array<CharArray>) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[i].size || grid[i][j] == '0') {
            return
        }
        grid[i][j] = '0'
        visit(i - 1, j, grid)
        visit(i, j - 1, grid)
        visit(i + 1, j, grid)
        visit(i, j + 1, grid)
    }
}