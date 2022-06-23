package leetcode.solution.n127

import java.util.LinkedList

/**
 * [127. Word Ladder](https://leetcode.com/problems/word-ladder/)
 */
class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val queue = LinkedList<String>()
        queue.offer(beginWord)
        val visited = HashSet<String>()
        var result = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val word = queue.poll()
                if (word == endWord) return result
                wordList.forEach {
                    var c = 0
                    for (i in word.indices) {
                        if (word[i] != it[i]) c++
                        if (c > 1) break
                    }
                    if (c == 1 && !visited.contains(it)) {
                        visited.add(it)
                        queue.offer(it)
                    }
                }
            }
            result++
        }
        return 0
    }
}