package leetcode.solution.n135

/**
 * [135. Candy](https://leetcode.com/problems/candy/)
 */
class Solution {
    fun candy(ratings: IntArray): Int {
        val result = IntArray(ratings.size) { 1 }
        do {
            var changed = false
            for (i in ratings.indices) {
                if (i != ratings.size - 1 && ratings[i] > ratings[i + 1] && result[i] <= result[i + 1]) {
                    result[i] = result[i + 1] + 1
                    changed = true
                }
                if (i > 0 && ratings[i] > ratings[i - 1] && result[i] <= result[i - 1]) {
                    result[i] = result[i - 1] + 1
                    changed = true
                }
            }
        } while (changed)
        return result.sum()
    }
}