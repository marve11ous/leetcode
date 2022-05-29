package leetcode.solution.n121

/**
 * [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var min = prices[0]
        for (i in 1 until prices.size) {
            result = result.coerceAtLeast(prices[i] - min)
            min = min.coerceAtMost(prices[i])
        }
        return result
    }
}