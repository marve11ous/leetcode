package leetcode.solution.n150

import java.util.*

/**
 * [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 */
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = LinkedList<Int>()
        tokens.forEach {
            when (it) {
                "+" -> stack.push(stack.pop() + stack.pop())
                "-" -> stack.pop().let { sub -> stack.push(stack.pop() - sub) }
                "*" -> stack.push(stack.pop() * stack.pop())
                "/" -> stack.pop().let { div -> stack.push(stack.pop() / div) }
                else -> stack.push(Integer.valueOf(it))
            }
        }
        return stack.peek()
    }
}