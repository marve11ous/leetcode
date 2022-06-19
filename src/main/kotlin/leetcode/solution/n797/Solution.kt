package leetcode.solution.n797

/**
 * [797. All Paths From Source to Target](https://leetcode.com/problems/all-paths-from-source-to-target/)
 */
class Solution {
    fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        dfs(graph, 0, ArrayList(), result)
        return result
    }

    private fun dfs(graph: Array<IntArray>, current: Int, path: ArrayList<Int>, result: ArrayList<List<Int>>) {
        path.add(current)
        if (current == graph.size - 1) {
            result.add(path.toList())
        } else {
            graph[current].forEach { dfs(graph, it, path, result) }
        }
        path.remove(current)
    }
}