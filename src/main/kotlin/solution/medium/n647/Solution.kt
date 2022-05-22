package solution.medium.n647

/**
 * [647. Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)
 */
class Solution {
    fun countSubstrings(s: String): Int {
        var result = 0
        for (i in s.indices) {
            result += countSubstrings(s, i, i)
            result += countSubstrings(s, i, i + 1)
        }
        return result
    }

    private fun countSubstrings(s: String, left: Int, right: Int): Int {
        var i = left
        var j = right
        var result = 0
        while (i >= 0 && j < s.length && s[i] == s[j]) {
            result++
            i--
            j++
        }
        return result
    }
}