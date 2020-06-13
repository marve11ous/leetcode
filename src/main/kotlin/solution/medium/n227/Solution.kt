package solution.medium.n227

import java.util.*

/**
 * 227. Basic Calculator II
 *
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
 * The integer division should truncate toward zero.
 */

class Solution {
    fun calculate(s: String): Int {
        val numStack = LinkedList<Int>()
        var op = '+'
        var num = 0
        for (ch in s) {
            if (ch == ' ') {
                continue
            }
            if (ch.isDigit()) {
                num = num * 10 + (ch - '0')
            } else {
                doOperation(op, num, numStack)
                op = ch
                num = 0
            }
        }
        doOperation(op, num, numStack)
        return numStack.sum()
    }

    private fun doOperation(op: Char, num: Int, numStack: LinkedList<Int>) {
        when (op) {
            '+' -> numStack.offer(num)
            '-' -> numStack.offer(-num)
            '*' -> numStack.offer(numStack.pollLast() * num)
            '/' -> numStack.offer(numStack.pollLast() / num)
        }
    }

}