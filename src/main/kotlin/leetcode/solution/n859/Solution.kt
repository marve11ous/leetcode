package leetcode.solution.n859

/**
 * [859. Buddy Strings](https://leetcode.com/problems/buddy-strings/submissions/)
 */
class Solution {
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }
        if (s == goal) {
            val chars = Array(26) { false }
            for (c in s.chars()) {
                if (chars[c - 97]) return true
                chars[c - 97] = true
            }
            return false
        }
        var find = false
        var chars: Pair<Char, Char>? = null
        for (i in s.indices) {
            if (s[i] == goal[i]) continue
            if (chars == null) {
                chars = s[i] to goal[i]
            } else {
                if (find || s[i] != chars.second || goal[i] != chars.first) return false
                find = true
            }
        }
        return find
    }
}