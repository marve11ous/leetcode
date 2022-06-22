package leetcode.solution.n886

import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * [886. Possible Bipartition](https://leetcode.com/problems/possible-bipartition/)
 */
class Solution {
    fun possibleBipartition(n: Int, dislikes: Array<IntArray>): Boolean {
        val graph = HashMap<Int, HashSet<Int>>()
        dislikes.forEach {
            graph.computeIfAbsent(it[0]) { HashSet() }.add(it[1])
            graph.computeIfAbsent(it[1]) { HashSet() }.add(it[0])
        }
        val colored = BooleanArray(n + 1)
        val visited = BooleanArray(n + 1)
        for (i in 1..n) {
            if (!visited[i] && !graph.check(i, visited, colored)) return false
        }
        return true
    }

    private fun Map<Int, Set<Int>>.check(i: Int, visited: BooleanArray, color: BooleanArray): Boolean {
        var result = true
        this[i]?.forEach {
            when {
                result && !visited[it] -> {
                    color[it] = !color[i]
                    visited[it] = true
                    result = check(it, visited, color)
                }
                color[it] == color[i] -> return false
            }
        }
        return result
    }
}