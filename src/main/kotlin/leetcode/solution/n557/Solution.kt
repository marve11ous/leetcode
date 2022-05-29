package leetcode.solution.n557

/**
 * [557. Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/)
 */
class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ").joinToString(" ") { it.toCharArray().reverse() }
    }

    private fun CharArray.reverse(): String {
        var l = 0
        var r = size - 1
        while (l <= r) {
            val temp = this[l]
            this[l++] = this[r]
            this[r--] = temp
        }
        return String(this)
    }
}