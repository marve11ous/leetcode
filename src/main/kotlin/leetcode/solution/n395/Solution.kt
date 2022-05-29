package leetcode.solution.n395

import kotlin.math.max

/**
 * 395. Longest Substring with At Least K Repeating Characters
 *
 * Find the length of the longest substring T of a given string (consists of lowercase letters only) such that every
 * character in T appears no less than k times.
 */
class Solution {
    fun longestSubstring(s: String, k: Int): Int {
        val count = Array(26) { 0 }
        s.forEach { count[it - 'a']++ }
        if (s.all { count[it - 'a'] >= k }) {
            return s.length
        }
        var i = -1
        var result = 0
        while (++i < s.length) {
            if (count[s[i] - 'a'] < k) {
                continue
            }
            var j = i + 1
            while (j < s.length && count[s[j] - 'a'] >= k) {
                j++
            }
            if (j - i > result) {
                result = max(longestSubstring(s.substring(i, j), k), result)
            }
            i = j
        }
        return result
    }
}