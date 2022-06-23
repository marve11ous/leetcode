package leetcode.solution.n409

/**
 * [409. Longest Palindrome](https://leetcode.com/problems/longest-palindrome/)
 */
class Solution {
    fun longestPalindrome(s: String): Int {
        val chars = HashSet<Char>()
        var result = 0
        s.forEach {
            if (chars.contains(it)) {
                result += 2
                chars.remove(it)
            } else {
                chars.add(it)
            }
        }
        if (chars.isNotEmpty()) result++
        return result
    }
}