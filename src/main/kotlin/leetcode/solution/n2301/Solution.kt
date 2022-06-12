package leetcode.solution.n2301

/**
 * [2301. Match Substring After Replacement](https://leetcode.com/problems/match-substring-after-replacement/)
 */
class Solution {
    fun matchReplacement(s: String, sub: String, mappings: Array<CharArray>): Boolean {
        val mapping = HashMap<Char, HashSet<Char>>().apply {
            mappings.forEach { computeIfAbsent(it[0]) { HashSet() }.add(it[1]) }
        }
        for (i in s.indices) {
            if (mapping.match(s[i], sub[0])) {
                var j = 1
                while (i + j < s.length && j < sub.length) {
                    if (mapping.match(s[i + j], sub[j])) j++ else break
                }
                if (j == sub.length) return true
            }
        }
        return false
    }

    private fun HashMap<Char, HashSet<Char>>.match(c1: Char, c2: Char): Boolean {
        return c1 == c2 || this[c2]?.contains(c1) ?: false
    }
}
