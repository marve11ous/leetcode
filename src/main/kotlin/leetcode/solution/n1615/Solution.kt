package leetcode.solution.n1615

/**
 * [1615. Maximal Network Rank](https://leetcode.com/problems/maximal-network-rank/)
 */
class Solution {
    fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
        val graph = HashMap<Int, HashSet<Int>>()
        roads.forEach {
            graph.computeIfAbsent(it[0]) { HashSet() }.add(it[1])
            graph.computeIfAbsent(it[1]) { HashSet() }.add(it[0])
        }
        var result = 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                var rank = 0
                graph[i]?.let {
                    rank += it.size
                    if (it.contains(j)) rank--
                }
                graph[j]?.let { rank += it.size }
                result = result.coerceAtLeast(rank)
            }
        }
        return result
    }
}