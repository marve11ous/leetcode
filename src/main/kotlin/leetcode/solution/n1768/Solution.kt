package leetcode.solution.n1768

/**
 * [1768. Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)
 */
class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i = 0
        var j = 0
        val result = CharArray(word1.length + word2.length)
        while (i < word1.length && i < word2.length) {
            result[j++] = word1[i]
            result[j++] = word2[i]
            i++
        }
        while (i < word1.length) {
            result[j++] = word1[i++]
        }
        while (i < word2.length) {
            result[j++] = word2[i++]
        }
        return String(result)
    }
}