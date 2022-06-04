package leetcode.solution.n542

import java.util.*

/**
 * [542. 01 Matrix](https://leetcode.com/problems/01-matrix/)
 */
class Solution {
    companion object {
        private val directions = listOf(0 to 1, 0 to -1, 1 to 0, -1 to 0)
    }

    fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val queue = LinkedList<Pair<Int, Int>>()
        for (i in mat.indices) {
            for (j in mat[0].indices) {
                if (mat[i][j] == 0) queue.offer(i to j)
            }
        }
        val visited = Array(mat.size) { BooleanArray(mat[0].size) }
        val result = Array(mat.size) { IntArray(mat[0].size) { Int.MAX_VALUE } }
        var depth = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, j) = queue.poll()
                visited[i][j] = true
                if (mat[i][j] == 0) result[i][j] = 0
                directions.forEach { (r, c) ->
                    if (i + r in mat.indices && j + c in mat[0].indices && !visited[i + r][j + c]) {
                        if (mat[i + r][j + c] == 1) result[i + r][j + c] = result[i + r][j + c].coerceAtMost(depth)
                        queue.offer(i + r to j + c)
                    }
                }
            }
            depth++
        }
        return result
    }

}