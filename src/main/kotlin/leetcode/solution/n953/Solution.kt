package leetcode.solution.n953

/**
 * [953. Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/)
 */
class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val dict = IntArray(26)
        order.forEachIndexed { i, c -> dict[c - 'a'] = i }
        for (i in 0 until words.size - 1) {
            var j = 0
            while (j < words[i].length && j < words[i + 1].length) {
                val order1 = dict[words[i][j] - 'a']
                val order2 = dict[words[i + 1][j] - 'a']
                if (order1 > order2) return false
                if (order1 < order2) break
                j++
            }
            if (j == words[i + 1].length && words[i].length > words[i + 1].length) return false
        }
        return true
    }
}