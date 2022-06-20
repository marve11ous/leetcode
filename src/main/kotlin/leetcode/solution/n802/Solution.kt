package leetcode.solution.n802

/**
 * [802. Find Eventual Safe States](https://leetcode.com/problems/find-eventual-safe-states/)
 */
class Solution {
    fun eventualSafeNodes(graph: Array<IntArray>): List<Int> {
        val visited = IntArray(graph.size)
        graph.indices.forEach { dfs(it, graph, visited) }
        val result = ArrayList<Int>()
        for (i in visited.indices) {
            if (visited[i] > 0) result.add(i)
        }
        return result.toList()
    }

    private fun dfs(i: Int, graph: Array<IntArray>, visited: IntArray): Int {
        if (visited[i] == 0) {
            visited[i] = -1
            if (graph[i].map { dfs(it, graph, visited) }.sum() == graph[i].size) visited[i] = 1
        }
        return visited[i]
    }
}