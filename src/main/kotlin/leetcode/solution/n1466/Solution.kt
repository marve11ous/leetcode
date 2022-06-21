package leetcode.solution.n1466

import java.util.LinkedList

/**
 * [1466. Reorder Routes to Make All Paths Lead to the City Zero](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/)
 */
class Solution {
    fun minReorder(n: Int, connections: Array<IntArray>): Int {
        val graph = HashMap<Int, HashSet<Int>>()
        val reversed = HashMap<Int, HashSet<Int>>()
        connections.forEach {
            graph.computeIfAbsent(it[0]) { HashSet() }.add(it[1])
            reversed.computeIfAbsent(it[1]) { HashSet() }.add(it[0])
        }
        val queue = LinkedList<Int>()
        queue.offer(0)
        var result = 0
        val visited = BooleanArray(n)
        while (queue.isNotEmpty()) {
            val i = queue.poll()
            if (visited[i]) continue
            visited[i] = true
            reversed[i]?.filter { !visited[it] }?.forEach { queue.offer(it) }
            graph[i]?.filter { !visited[it] }?.forEach {
                queue.offer(it)
                result++
            }
        }
        return result
    }
}