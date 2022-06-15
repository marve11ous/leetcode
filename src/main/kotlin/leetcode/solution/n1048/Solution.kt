package leetcode.solution.n1048

/**
 * [1048. Longest String Chain](https://leetcode.com/problems/longest-string-chain/)
 */
class Solution {
    fun longestStrChain(words: Array<String>): Int {
        val map = HashMap<String, Int>()
        words.sortWith(Comparator { w1, w2 -> w1.length - w2.length })
        var result = 0
        words.forEach { word ->
            var max = 0
            for (i in word.indices) {
                map[word.removeRange(i..i)]?.let { max = max.coerceAtLeast(it) }
            }
            map[word] = max + 1
            result = result.coerceAtLeast(max + 1)
        }
        return result
    }
}