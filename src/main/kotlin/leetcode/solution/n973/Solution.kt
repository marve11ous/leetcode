package leetcode.solution.n973

import java.util.PriorityQueue

/**
 * [973. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)
 */
class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val pq = PriorityQueue<IntArray>(Comparator { o1, o2 -> o1.dist() - o2.dist() })
        points.forEach { pq.add(it) }
        return Array(k) { pq.poll() }
    }

    private fun IntArray.dist(): Int = this[0] * this[0] + this[1] * this[1]
}