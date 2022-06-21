package leetcode.solution.n1642

import java.util.*

/**
 * [1642. Furthest Building You Can Reach](https://leetcode.com/problems/furthest-building-you-can-reach/)
 */
class Solution {
    fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var bricksLeft = bricks
        var laddersLeft = ladders
        for (i in 0 until heights.size - 1) {
            if (heights[i] >= heights[i + 1]) continue
            (heights[i + 1] - heights[i]).also {
                bricksLeft -= it
                pq.add(it)
            }

            if (bricksLeft < 0) {
                if (laddersLeft == 0) return i
                laddersLeft--
                bricksLeft += pq.poll()
            }
        }
        return heights.size - 1
    }

}