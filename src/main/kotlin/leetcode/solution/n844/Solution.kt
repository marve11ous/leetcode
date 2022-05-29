package leetcode.solution.n844

import java.util.*

/**
 * [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)
 */
class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return s.process() == t.process()
    }

    private fun String.process(): List<Char> =
        LinkedList<Char>().also { this.forEach { c -> if (c != '#') it.push(c) else if (it.isNotEmpty()) it.pop() } }
}