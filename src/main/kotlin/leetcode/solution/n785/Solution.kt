package leetcode.solution.n785

/**
 * [785. Is Graph Bipartite?](https://leetcode.com/problems/is-graph-bipartite/)
 */
class Solution {
    fun isBipartite(graph: Array<IntArray>): Boolean {
        val visited = BooleanArray(graph.size)
        val colored = BooleanArray(graph.size)
        for (i in graph.indices) {
            if (!visited[i] && !graph.traverse(i, visited, colored)) return false
        }
        return true
    }

    private fun Array<IntArray>.traverse(i: Int, visited: BooleanArray, colored: BooleanArray): Boolean {
        var result = true
        this[i].forEach {
            when {
                result && !visited[it] -> {
                    colored[it] = !colored[i]
                    visited[it] = true
                    result = traverse(it, visited, colored)
                }
                colored[i] == colored[it] -> return false
            }
        }
        return result
    }
}