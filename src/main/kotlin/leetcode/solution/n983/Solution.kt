package leetcode.solution.n983

class Solution {

    private lateinit var dp: IntArray
    private lateinit var days: IntArray
    private lateinit var costs: IntArray
    private val durations = intArrayOf(1, 7, 30)

    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        dp = IntArray(days.size) { -1 }
        this.days = days
        this.costs = costs
        return dp(0)
    }

    private fun dp(dayIndex: Int): Int {
        if (dayIndex >= days.size) {
            return 0
        }
        if (dp[dayIndex] >= 0) {
            return dp[dayIndex]
        }
        var res = Int.MAX_VALUE
        var i = dayIndex
        for (j in durations.indices) {
            while (i < days.size && days[i] < days[dayIndex] + durations[j]) {
                i++
            }
            res = min(res, dp(i) + costs[j])
        }
        dp[dayIndex] = res
        return res
    }

    private fun min(a: Int, b: Int) = if (a < b) a else b
}