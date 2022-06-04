package leetcode.solution.n139

/**
 * [139. Word Break](https://leetcode.com/problems/word-break/)
 */
class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val set = HashSet(wordDict)
        val dp = BooleanArray(s.length + 1)
        dp[0] = true
        for (i in s.indices) {
            if (dp[i]) {
                (i + 1..s.length)
                    .filter { !dp[it] }
                    .filter { set.contains(s.substring(i, it)) }
                    .forEach { dp[it] = true }
            }
        }
        return dp.last()
    }
}