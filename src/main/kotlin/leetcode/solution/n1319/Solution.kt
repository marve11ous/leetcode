package leetcode.solution.n1319

/**
 * [1319. Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)
 */
class Solution {
    fun makeConnected(n: Int, connections: Array<IntArray>): Int {
        if (connections.size < n - 1) return -1
        val connected = HashMap<Int, HashSet<Int>>()
        connections.forEach { connection ->
            connected.connect(connection[0], connection[1])
            connected.connect(connection[1], connection[0])
        }
        val visited = BooleanArray(n)
        var result = -1
        for (i in 0 until n) {
            if (!visited[i]) {
                result++
                dfs(i, n, connected, visited)
            }
        }
        return result
    }

    private fun dfs(i: Int, n: Int, connected: HashMap<Int, HashSet<Int>>, visited: BooleanArray) {
        visited[i] = true
        connected[i]?.forEach { if (!visited[it]) dfs(it, n, connected, visited) }
    }

    private fun HashMap<Int, HashSet<Int>>.connect(first: Int, second: Int) {
        compute(first) { _, v -> (v ?: HashSet()).apply { add(second) } }
    }

}