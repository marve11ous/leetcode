package leetcode.solution.n438

/**
 * [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
 */
class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.length < p.length) return listOf()
        val target = HashMap<Char, Int>()
        val sw = HashMap<Char, Int>()
        val result = ArrayList<Int>()
        for (i in s.indices) {
            if (i < p.length) {
                target[p[i]] = (target[p[i]] ?: 0) + 1
            } else {
                sw.computeIfPresent(s[i - p.length]) { _, v -> if (v > 1) v - 1 else null }
            }
            sw[s[i]] = (sw[s[i]] ?: 0) + 1
            if (i + 1 >= p.length && target == sw) result.add(i + 1 - p.length)
        }
        return result
    }
}