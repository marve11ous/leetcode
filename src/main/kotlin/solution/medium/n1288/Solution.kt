package solution.medium.n1288

/**
 * [1288. Remove Covered Intervals](https://leetcode.com/problems/remove-covered-intervals/)
 */
class Solution {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()) return 0
        intervals.sortWith(Comparator<IntArray> { a, b -> a[0] - b[0] }.thenComparator { a, b -> b[1] - a[1] })
        var current: IntArray? = null
        var result = 0
        intervals.forEach { interval ->
            if (current == null || current!![0] > interval[0] || current!![1] < interval[1]) {
                current = interval
                result++
            }
        }
        return result
    }
}