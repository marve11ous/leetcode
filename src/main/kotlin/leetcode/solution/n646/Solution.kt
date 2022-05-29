package leetcode.solution.n646

class Solution {
    private lateinit var pairs: Array<IntArray>
    private lateinit var dp: IntArray

    fun findLongestChain(pairs: Array<IntArray>): Int {
        if (pairs.size < 2) {
            return pairs.size
        }
        this.pairs = pairs
        this.dp = IntArray(pairs.size)
        var result = 0
        for (i in pairs.indices) {
            result = max(result, dp(i))
        }
        return result
    }

    private fun dp(i: Int): Int {
        if (dp[i] != 0) return dp[i]
        var max = 0
        for (j in pairs.indices) {
            if (i != j && pairs[i][0] > pairs[j][1]) {
                max = max(max, dp(j))
            }
        }
        dp[i] = max + 1
        return dp[i]
    }

    private fun max(a: Int, b: Int) = if (a < b) b else a
}