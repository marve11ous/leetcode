package leetcode.solution.n847

import java.util.LinkedList

/**
 * [847. Shortest Path Visiting All Nodes](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
 */
class Solution {
    fun shortestPathLength(graph: Array<IntArray>): Int {
        if (graph.size == 1) return 0

        val finalMask = (1 shl graph.size) - 1
        val visited = Array(graph.size) { BooleanArray(finalMask) }
        val queue = LinkedList<Pair<Int, Int>>()

        for (i in visited.indices) {
            queue.add(i to (1 shl i))
            visited[i][1 shl i] = true
        }

        var result = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, mask) = queue.poll()
                graph[i].forEach {
                    val nextMask = mask or (1 shl it)
                    if (nextMask == finalMask) return result
                    if (!visited[it][nextMask]) {
                        visited[it][nextMask] = true
                        queue.offer(it to nextMask)
                    }
                }
            }
            result++
        }

        return -1
    }
}