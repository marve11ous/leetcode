package leetcode.solution.n473

/**
 * [473. Matchsticks to Square](https://leetcode.com/problems/matchsticks-to-square/)
 */
class Solution {
    fun makesquare(matchsticks: IntArray): Boolean {
        var sum = 0
        var max = 0
        matchsticks.forEach {
            sum += it
            if (it > max) max = it
        }
        if (sum % 4 != 0 || max > sum / 4) return false
        val edges = IntArray(4) { sum / 4 }
        return makesquare(edges, matchsticks, 0)
    }

    private fun makesquare(edges: IntArray, matchsticks: IntArray, i: Int): Boolean {
        if (edges.all { it == 0 }) return true
        for (j in edges.indices) {
            if (edges[j] - matchsticks[i] >= 0) {
                edges[j] -= matchsticks[i]
                if (makesquare(edges, matchsticks, i + 1)) return true
                edges[j] += matchsticks[i]
            }
        }
        return false
    }
}