package leetcode.solution.n1332

/**
 * [1332. Remove Palindromic Subsequences](https://leetcode.com/problems/remove-palindromic-subsequences/)
 */
class Solution {
    fun removePalindromeSub(s: String): Int {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l++] != s[r--]) return 2
        }
        return 1
    }
}