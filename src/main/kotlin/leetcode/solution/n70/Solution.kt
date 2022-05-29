package leetcode.solution.n70

class Solution {

    fun climbStairs(n: Int): Int {
        if (n < 3) {
            return n
        }
        val dp = IntArray(n)
        dp[0] = 1
        dp[1] = 2
        for (i in 2 until dp.size) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n - 1]
    }

}