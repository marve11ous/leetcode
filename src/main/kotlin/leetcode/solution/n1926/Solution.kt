package leetcode.solution.n1926

import java.util.*

/**
 * [1926. Nearest Exit from Entrance in Maze](https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/)
 */
class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val queue = LinkedList<Pair<Int, Int>>()
        queue.offer(entrance[0] to entrance[1])
        var result = 0
        val visited = Array(maze.size) { BooleanArray(maze[0].size) }
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, j) = queue.poll()
                if (visited[i][j]) continue
                visited[i][j] = true
                if (result > 0 && (i == 0 || j == 0 || i == maze.size - 1 || j == maze[0].size - 1)) return result
                if (i > 0 && !visited[i - 1][j] && maze[i - 1][j] == '.') queue.offer(i - 1 to j)
                if (i < maze.size - 1 && !visited[i + 1][j] && maze[i + 1][j] == '.') queue.offer(i + 1 to j)
                if (j > 0 && !visited[i][j - 1] && maze[i][j - 1] == '.') queue.offer(i to j - 1)
                if (j < maze[0].size - 1 && !visited[i][j + 1] && maze[i][j + 1] == '.') queue.offer(i to j + 1)
            }
            result++
        }
        return -1
    }
}