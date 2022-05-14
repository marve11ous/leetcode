package solution.medium.n743


/**
 * [743. Network Delay Time](https://leetcode.com/problems/network-delay-time/)
 */
class Solution {

    fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
        val timesMap = HashMap<Int, MutableList<Pair<Int, Int>>>().apply {
            times.forEach { compute(it[0]) { _, v -> (v ?: ArrayList()).apply { add(it[1] to it[2]) } } }
            values.forEach { it.sortWith { a, b -> a.second - b.second } }
        }

        val visited = IntArray(n) { Int.MAX_VALUE }
        visit(k, 0, visited, timesMap)

        val result = visited.maxOrNull() ?: Int.MIN_VALUE
        return if (result == Int.MAX_VALUE) -1 else result
    }

    private fun visit(current: Int, currentTime: Int, visited: IntArray, timesMap: Map<Int, List<Pair<Int, Int>>>) {
        if (currentTime < visited[current - 1]) {
            visited[current - 1] = currentTime
            timesMap[current]?.forEach { (next, time) -> visit(next, currentTime + time, visited, timesMap) }
        }
    }
}