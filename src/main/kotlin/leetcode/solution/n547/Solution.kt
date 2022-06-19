package leetcode.solution.n547

import java.util.LinkedList

/**
 * [547. Number of Provinces](https://leetcode.com/problems/number-of-provinces/)
 */
class Solution {
    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val visited = BooleanArray(isConnected.size)
        val queue = LinkedList<Int>()
        var result = 0
        for (city in isConnected.indices) {
            if (visited[city]) continue
            result++
            queue.add(city)
            while (queue.isNotEmpty()) {
                val i = queue.poll()
                if (visited[i]) continue
                visited[i] = true
                for (j in isConnected.indices) {
                    if (isConnected[i][j] == 1 && !visited[j]) queue.offer(j)
                }
            }
        }
        return result
    }
}