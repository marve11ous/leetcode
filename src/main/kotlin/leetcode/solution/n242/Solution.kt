package leetcode.solution.n242

/**
 * [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)
 */
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val counts = IntArray(26)
        s.forEach { counts[it - 'a']++ }
        t.forEach { counts[it - 'a']-- }
        return counts.all { it == 0 }
    }

}