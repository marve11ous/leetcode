package leetcode.solution.n32

import java.util.*

/**
 * [32. Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/)
 */
class Solution {
    fun longestValidParentheses(s: String): Int {
        val stack = LinkedList<Int>().apply { push(-1) }
        var result = 0
        for (i in s.indices) {
            if (s[i] == ')' && stack.peek() >= 0 && s[stack.pop()] == '(') {
                result = Math.max(result, i - stack.peek())
            } else {
                stack.push(i)
            }
        }
        return result
    }
}