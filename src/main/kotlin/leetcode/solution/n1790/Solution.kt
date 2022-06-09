package leetcode.solution.n1790

/**
 * [1790. Check if One String Swap Can Make Strings Equal](https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/)
 */
class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        if (s1.length != s2.length) return false
        var l = -1
        var r = -1
        for (i in s1.indices) {
            if (s1[i] != s2[i]) {
                if (l < 0) {
                    l = i
                    continue
                }
                if (r >= 0) return false
                r = i
            }
        }
        return l == -1 || r >= 0 && s1[r] == s2[l] && s1[l] == s2[r]
    }
}