package solution.medium.n1209

import java.util.*

/**
 * [1209. Remove All Adjacent Duplicates in String II](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)
 */
class Solution {
    fun removeDuplicates(s: String, k: Int): String {
        val stack = LinkedList<CharCount>()
        s.forEach { c ->
            val current = stack.peek()
            if (c != current?.char) {
                stack.push(CharCount(c, 1))
            } else if (++stack.peek().cnt == k) {
                stack.pop()
            }
        }
        val builder = StringBuilder()
        stack.forEach { charCnt -> repeat(charCnt.cnt) { builder.append(charCnt.char) } }
        return builder.reverse().toString()
    }

    private class CharCount(val char: Char, var cnt: Int = 0)
}