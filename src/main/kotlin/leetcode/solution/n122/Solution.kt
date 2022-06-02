package leetcode.solution.n122

/**
 * [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
 */
class Solution {

    fun maxProfit(prices: IntArray): Int {
        var buy = -1
        var result = 0
        var prev = Int.MAX_VALUE
        for (i in prices.indices) {
            if (prices[i] < prev && (prices[i] < buy || buy < 0)) {
                buy = prices[i]
            } else if (buy >= 0 && (i == prices.size - 1 || prices[i] > prices[i + 1])) {
                result += prices[i] - buy
                buy = -1
            }
            prev = prices[i]
        }
        return result
    }

}