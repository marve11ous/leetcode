package leetcode.solution.n5

class Solution {

    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        var left = 0
        var right = s.length
        var max = 0
        for (i in s.indices) {
            var j = 0
            while (check(s, i, j, j)) {
                j++
            }
            var curLength = 2 * (j - 1) + 1
            if (curLength > max) {
                max = curLength
                left = i - j + 1
                right = i + j
            }
            j = 0
            while (check(s, i, j, j + 1)) {
                j++
            }
            curLength = 2 * j
            if (curLength > max) {
                max = curLength
                left = i - j + 1
                right = i + j + 1
            }
        }
        return s.substring(left, right)
    }

    private fun check(s: String, i: Int, offsetL: Int, offsetR: Int): Boolean {
        val l = i - offsetL
        if (l < 0) {
            return false
        }
        val r = i + offsetR
        if (r >= s.length) {
            return false
        }
        val ch = s[l]
        if (ch == s[r]) {
            return true
        }
        return false
    }

}