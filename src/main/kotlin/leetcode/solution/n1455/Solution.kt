package leetcode.solution.n1455

/**
 * [1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence](https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/)
 */
class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        var i = 0
        var wordIndex = 1
        while (i < sentence.length) {
            var j = 0
            while (j < searchWord.length && i < sentence.length && sentence[i] != ' ') {
                if (sentence[i++] != searchWord[j]) break
                j++
            }
            if (j == searchWord.length) return wordIndex
            while (i < sentence.length && sentence[i] != ' ') i++
            wordIndex++
            i++
        }
        return -1
    }
}