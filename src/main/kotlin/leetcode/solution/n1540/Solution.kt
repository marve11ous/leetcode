package leetcode.solution.n1540

/**
 * [1540. Can Convert String in K Moves](https://leetcode.com/problems/can-convert-string-in-k-moves/)
 */
class Solution {
    fun canConvertString(s: String, t: String, k: Int): Boolean {
        if (s.length != t.length) {
            return false
        }
        val shifts = IntArray(26) { k / 26 + if (k % 26 < it) 0 else 1 }
        for (i in s.indices) {
            val shift = (t[i] - s[i] + 26) % 26
            if (shift == 0) continue
            if (--shifts[shift] < 0) return false
        }
        return true
    }

}