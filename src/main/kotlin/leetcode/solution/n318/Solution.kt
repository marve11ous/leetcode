package leetcode.solution.n318

/**
 * [318. Maximum Product of Word Lengths](https://leetcode.com/problems/maximum-product-of-word-lengths/)
 */
class Solution {
    fun maxProduct(words: Array<String>): Int {
        val charCounts = words.map { word -> word.map { 1 shl (it - 'a') }.reduce { acc, bit -> acc or bit } }
        var result = 0
        for (i in words.indices) {
            for (j in i + 1 until words.size) {
                if (charCounts[i] and charCounts[j] == 0)
                    result = result.coerceAtLeast(words[i].length * words[j].length)
            }
        }
        return result
    }
}