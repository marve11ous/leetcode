package leetcode.solution.n1654

import java.util.LinkedList

/**
 * [1654. Minimum Jumps to Reach Home](https://leetcode.com/problems/minimum-jumps-to-reach-home/)
 */
class Solution {
    fun minimumJumps(forbidden: IntArray, a: Int, b: Int, x: Int): Int {
        val queue = LinkedList<Pair<Int, Boolean>>()
        queue.add(0 to false)
        val visited = HashSet<Int>()
        forbidden.forEach { visited.add(it) }
        var steps = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val (i, back) = queue.pop()
                if (i == x) return steps
                if (visited.contains(i)) continue
                visited.add(i)
                if (!back && i - b > 0) queue.offer(i - b to true)
                if (i + a < 2000 + 2 * b) queue.offer(i + a to false)
            }
            steps++
        }
        return -1
    }
}