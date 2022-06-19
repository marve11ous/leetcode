package leetcode.solution.n205

/**
 * [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)
 */
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sReplaceMap = HashMap<Char, Char>()
        val tReplaceMap = HashMap<Char, Char>()
        for (i in s.indices) {
            val sReplace = sReplaceMap.computeIfAbsent(s[i]) { t[i] }
            val tReplace = tReplaceMap.computeIfAbsent(t[i]) { s[i] }
            if (tReplace != s[i] || sReplace != t[i]) return false
        }
        return true
    }
}