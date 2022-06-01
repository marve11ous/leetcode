package leetcode.solution.n567

/**
 * [567. Permutation in String](https://leetcode.com/problems/permutation-in-string/)
 */
class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val s1Map = HashMap<Char, Int>()
        s1.forEach { s1Map.inc(it) }
        val current = HashMap<Char, Int>()
        for (i in s1.indices) current.inc(s2[i])
        var l = 0
        var r = s1.length
        while (r < s2.length) {
            if (s1Map == current) return true
            current.dec(s2[l++])
            current.inc(s2[r++])
        }
        return s1Map == current
    }

    private fun HashMap<Char, Int>.inc(c: Char) {
        this[c] = (this[c] ?: 0) + 1
    }

    private fun HashMap<Char, Int>.dec(c: Char) {
        val v = (this[c] ?: 0) - 1
        if (v <= 0) this.remove(c) else this[c] = v
    }
}