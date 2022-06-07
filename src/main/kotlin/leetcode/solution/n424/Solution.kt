package leetcode.solution.n424

/**
 * [424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)
 */
class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val counts = IntArray(26)
        var l = 0
        var r = -1
        var max = 0
        var result = 0
        while (++r < s.length) {
            max = max.coerceAtLeast(++counts[s[r] - 'A'])
            while (r - l + 1 - max > k) {
                counts[s[l++] - 'A']--
            }
            result = result.coerceAtLeast(r - l + 1)
        }
        return result
    }
}