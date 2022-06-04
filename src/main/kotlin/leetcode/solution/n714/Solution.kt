package leetcode.solution.n714

/**
 * [714. Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)
 */
class Solution {

    fun maxProfit(prices: IntArray, fee: Int): Int {
        var profit = 0
        var buy = prices[0]
        for (i in 1 until prices.size) {
            profit = profit.coerceAtLeast(prices[i] - buy - fee)
            buy = buy.coerceAtMost(prices[i] - profit)
        }
        return profit
    }

}