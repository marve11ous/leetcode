package leetcode.solution.n2285

import java.util.*

/**
 * [2285. Maximum Total Importance of Roads](https://leetcode.com/problems/maximum-total-importance-of-roads/)
 */
class Solution {
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
        val counts = IntArray(n).apply {
            roads.forEach {
                this[it[0]]++
                this[it[1]]++
            }
        }

        val pq = PriorityQueue<Pair<Int, Int>>(Comparator { o1, o2 -> o1.second - o2.second })
            .apply { counts.forEachIndexed { i, cnt -> add(i to cnt) } }
        val importance = IntArray(n).apply {
            var k = 1
            while (pq.isNotEmpty()) {
                this[pq.poll().first] = k++
            }
        }

        var result = 0L
        roads.forEach {
            result += importance[it[0]]
            result += importance[it[1]]
        }
        return result
    }
}