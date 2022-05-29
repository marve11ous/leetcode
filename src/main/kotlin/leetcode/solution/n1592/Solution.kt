package leetcode.solution.n1592

import kotlin.math.min

/**
 * [1592. Rearrange Spaces Between Words](https://leetcode.com/problems/rearrange-spaces-between-words/)
 */
class Solution {
    fun reorderSpaces(text: String): String {
        val words = ArrayList<String>()
        var i = 0
        var spaceCount = 0
        while (i < text.length) {
            while (i < text.length && text[i] == ' ') {
                spaceCount++
                i++
            }
            var wordBuilder: StringBuilder? = null
            while (i < text.length && text[i] != ' ') {
                wordBuilder = (wordBuilder ?: StringBuilder()).append(text[i++])
            }
            if (wordBuilder != null) words.add(wordBuilder.toString())
        }
        val meanSpaceCount = if (words.size > 1) spaceCount / (words.size - 1) else spaceCount
        val result = StringBuilder()
        words.forEach {
            result.append(it).appendSpace(min(meanSpaceCount, spaceCount))
            spaceCount -= meanSpaceCount
        }
        result.appendSpace(spaceCount)
        return result.toString()
    }

    private fun StringBuilder.appendSpace(n: Int) {
        repeat(n) { append(' ') }
    }
}