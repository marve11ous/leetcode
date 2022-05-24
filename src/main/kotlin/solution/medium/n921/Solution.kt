package solution.medium.n921

import java.util.*

/**
 * [921. Minimum Add to Make Parentheses Valid](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)
 */
class Solution {
    fun minAddToMakeValid(s: String): Int {
        val stack = LinkedList<Char>()
        s.forEach { if (it == ')' && stack.peek() == '(') stack.pop() else stack.push(it) }
        return stack.size
    }
}