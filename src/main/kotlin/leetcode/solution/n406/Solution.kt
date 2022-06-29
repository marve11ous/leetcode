package leetcode.solution.n406

import java.util.*

/**
 * [406. Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)
 */
class Solution {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        people.sortWith(Comparator { o1, o2 -> if (o1[0] == o2[0]) o1[1] - o2[1] else o2[0] - o1[0] })
        val result = LinkedList<IntArray>()
        people.forEach { result.add(it[1], it) }
        return result.toTypedArray()
    }
}