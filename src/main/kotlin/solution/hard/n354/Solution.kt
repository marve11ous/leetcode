package solution.hard.n354

/**
 * [354. Russian Doll Envelopes](https://leetcode.com/problems/russian-doll-envelopes/)
 */
internal class Solution {
    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        envelopes.sortWith { x1, x2 -> if (x1[0] == x2[0]) x2[1] - x1[1] else x1[0] - x2[0] }
        val result = ArrayList<Int>()
        envelopes.map { it[1] }.forEach {
            if (result.isEmpty() || result[result.size - 1] < it) {
                result.add(it)
            } else {
                var i = result.binarySearch(it)
                if (i < 0) i = -(i + 1)
                result[i] = it
            }
        }
        return result.size
    }

}