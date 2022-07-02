package leetcode.solution.n394

import java.util.*

/**
 * [394. Decode String](https://leetcode.com/problems/decode-string/)
 */
class Solution {
    fun decodeString(s: String): String {
        val stack = LinkedList<Pair<Int, StringBuilder>>()
        stack.push(0 to StringBuilder())
        var i = -1
        while (++i < s.length) {
            when {
                s[i].isDigit() -> {
                    val count = StringBuilder()
                    while (s[i].isDigit()) count.append(s[i++])
                    stack.push(count.toString().toInt() to StringBuilder())
                }
                s[i] == ']' -> {
                    val (count, str) = stack.pop()
                    stack.peek().second.append(str.repeat(count))
                }
                else -> stack.peek().second.append(s[i])
            }
        }
        return stack.pop().second.toString()
    }
}