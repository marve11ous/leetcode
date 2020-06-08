package solution.easy.n20

import java.util.*

class Solution {

    companion object {
        val brackets = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )
    }

    fun isValid(s: String): Boolean {
        val stack = LinkedList<Char>()
        for (ch in s) {
            if (brackets.containsKey(ch)) {
                stack.offer(ch)
            } else if (brackets[stack.pollLast()] != ch) {
                return false
            }
        }
        return stack.isEmpty()
    }
}