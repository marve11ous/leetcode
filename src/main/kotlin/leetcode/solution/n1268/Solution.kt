package leetcode.solution.n1268

import kotlin.collections.ArrayList

/**
 * [1268. Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)
 */
class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        val result = ArrayList<List<String>>(searchWord.length)
        var l = 0
        var r = products.size - 1
        products.sort()
        for (i in searchWord.indices) {
            while (l <= r && (i >= products[l].length || products[l][i] != searchWord[i])) l++
            while (l <= r && (i >= products[r].length || products[r][i] != searchWord[i])) r--
            ArrayList<String>().apply {
                var j = l
                while (j <= r && j < l + 3) add(products[j++])
                result.add(this)
            }
        }
        return result
    }
}