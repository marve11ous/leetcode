package leetcode.solution.n1129

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * [1129. Shortest Path with Alternating Colors](https://leetcode.com/problems/shortest-path-with-alternating-colors/)
 */
class Solution {
    fun shortestAlternatingPaths(n: Int, redEdges: Array<IntArray>, blueEdges: Array<IntArray>): IntArray {
        val red = initGraph(redEdges)
        val blue = initGraph(blueEdges)
        val result = IntArray(n) { -1 }
        val redVisit = BooleanArray(n)
        val blueVisit = BooleanArray(n)
        val queue = LinkedList<Pair<Int, Boolean>>()
        queue.offer(0 to true)
        queue.offer(0 to false)
        var length = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, isBlue) = queue.poll()
                result[i] = if (result[i] == -1) length else result[i].coerceAtMost(length)
                if (isBlue) {
                    blueVisit[i] = true
                    red[i]?.filter { !redVisit[it] }?.forEach { queue.offer(it to false) }
                } else {
                    redVisit[i] = true
                    blue[i]?.filter { !blueVisit[it] }?.forEach { queue.offer(it to true) }
                }
            }
            length++
        }
        return result
    }

    private fun initGraph(edges: Array<IntArray>): Map<Int, Set<Int>> =
        HashMap<Int, HashSet<Int>>().apply {
            edges.forEach { computeIfAbsent(it[0]) { HashSet() }.add(it[1]) }
        }
}