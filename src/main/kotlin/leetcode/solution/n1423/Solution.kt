package leetcode.solution.n1423

/**
 * [1423. Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)
 */
class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val n = cardPoints.size - k
        var sum = 0
        for (i in 0 until n) {
            sum += cardPoints[i]
        }
        var total = sum
        var min = sum
        for (i in n until cardPoints.size) {
            total += cardPoints[i]
            sum += cardPoints[i] - cardPoints[i - n]
            min = min.coerceAtMost(sum)
        }
        return total - min
    }
}