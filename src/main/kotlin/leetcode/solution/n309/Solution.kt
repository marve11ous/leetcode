package leetcode.solution.n309

import kotlin.math.max

/**
 * [309. Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/)
 */
class Solution {
    fun maxProfit(
        prices: IntArray,
        i: Int = 0,
        canBuy: Boolean = true,
        dp: Array<HashMap<Boolean, Int>> = Array(prices.size) { HashMap() }
    ): Int {
        if (i >= prices.size) return 0
        return dp[i].computeIfAbsent(canBuy) {
            if (canBuy)
                max(maxProfit(prices, i + 1, false, dp) - prices[i], maxProfit(prices, i + 1, true, dp))
            else
                max(maxProfit(prices, i + 2, true, dp) + prices[i], maxProfit(prices, i + 1, false, dp))
        }
    }
}