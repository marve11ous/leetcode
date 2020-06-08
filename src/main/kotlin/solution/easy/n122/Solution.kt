package solution.easy.n122

class Solution {

    fun maxProfit(prices: IntArray): Int {
        var canBuy = true
        var price = 0
        var output = 0
        for (i in 0 until prices.size - 1) {
            if (prices[i] < prices[i + 1] && canBuy) {
                price = prices[i]
                canBuy = false
            }
            if (prices[i] > prices[i + 1] && !canBuy) {
                output += prices[i] - price
                canBuy = true
            }
        }
        if (!canBuy) {
            output += prices[prices.size - 1] - price
        }
        return output
    }

}