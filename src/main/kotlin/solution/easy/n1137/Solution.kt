package solution.easy.n1137

class Solution {
    fun tribonacci(n: Int): Int {
        if (n < 2) {
            return if (n == 0) 0 else 1
        }
        val dp = IntArray(n + 1)
        dp[0] = 0
        dp[1] = 1
        dp[2] = 1
        for (i in 3 until dp.size) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
        }
        return dp[n]
    }
}