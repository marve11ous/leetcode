package leetcode.solution.n3

/**
 * [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
class Solution {

    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>()
        var result = 0
        var i = 0
        s.forEachIndexed { j, c ->
            map[c]?.let { i = i.coerceAtLeast(it) }
            result = result.coerceAtLeast(j - i + 1)
            map[c] = j + 1
        }
        return result
    }

}