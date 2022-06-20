package leetcode.solution.n820

/**
 * [820. Short Encoding of Words](https://leetcode.com/problems/short-encoding-of-words/)
 */
class Solution {
    fun minimumLengthEncoding(words: Array<String>): Int {
        val trieMap = HashMap<Trie, Int>()
        val root = Trie()
        for (i in words.indices) {
            var current = root
            for (j in words[i].length - 1 downTo 0) {
                current = current.get(words[i][j])
            }
            trieMap[current] = i
        }
        var result = 0
        trieMap.forEach { (trie, i) ->
            if (trie.count == 0) result += words[i].length + 1
        }
        return result
    }
}

private class Trie {
    val children = Array<Trie?>(26) { null }
    var count = 0

    fun get(c: Char): Trie {
        return children[c - 'a']
            ?: Trie().also {
                children[c - 'a'] = it
                count++
            }
    }
}