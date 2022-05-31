package leetcode.solution.n242

/**
 * [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)
 */
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.countChars() == t.countChars()
    }

    private fun String.countChars(): Map<Char, Int> {
        val map = HashMap<Char, Int>()
        forEach { map.compute(it) { _, v -> (v ?: 0) + 1 } }
        return map
    }

}