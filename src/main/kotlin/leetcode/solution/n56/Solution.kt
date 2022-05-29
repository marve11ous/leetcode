package leetcode.solution.n56

import kotlin.math.max

/**
 * 56. Merge Intervals
 *
 * Given a collection of intervals, merge all overlapping intervals.
 */
class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()
        val consumed = HashSet<Int>()
        val sortedIntervals = intervals.sortedArrayWith(compareBy({ it[0] }, { it[1] }))
        for (i in sortedIntervals.indices) {
            if (consumed.contains(i)) {
                continue
            }
            val l1 = sortedIntervals[i][0]
            var r1 = sortedIntervals[i][1]
            for (j in sortedIntervals.indices) {
                if (i == j || consumed.contains(j)) {
                    continue
                }
                val l2 = sortedIntervals[j][0]
                val r2 = sortedIntervals[j][1]
                if (l2 in l1..r1) {
                    r1 = max(r1, r2)
                    consumed.add(j)
                }
            }
            result.add(intArrayOf(l1, r1))
        }
        return result.toTypedArray()
    }
}