package solution.easy.n796

/**
 * [796. Rotate String](https://leetcode.com/problems/rotate-string/)
 */
class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        goal.mapIndexedNotNull { index, c -> if (c == s[0]) index else null }.forEach { offset ->
            for (i in s.indices) {
                if (s[i] != goal[(i + offset) % goal.length]) return@forEach
            }
            return true
        }
        return false
    }
}