package leetcode.solution.n1014

/**
 * [1014. Best Sightseeing Pair](https://leetcode.com/problems/best-sightseeing-pair/)
 */
class Solution {
    fun maxScoreSightseeingPair(values: IntArray): Int {
        var result = 0
        var max = 0
        for (i in 1 until values.size) {
            max = max.coerceAtLeast(values[i - 1])
            result = result.coerceAtLeast(--max + values[i])
        }
        return result
    }
}