package leetcode.solution.n630

import java.util.*

/**
 * [630. Course Schedule III](https://leetcode.com/problems/course-schedule-iii/)
 */
class Solution {
    fun scheduleCourse(courses: Array<IntArray>): Int {
        courses.sortBy { it[1] }
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var day = 0
        courses.forEach {
            val duration = it[0]
            when {
                day + duration <= it[1] -> {
                    day += duration
                    pq.offer(duration)
                }
                !pq.isEmpty() && pq.peek() > duration -> {
                    day += duration - pq.poll()
                    pq.offer(duration)
                }
            }
        }
        return pq.size
    }
}