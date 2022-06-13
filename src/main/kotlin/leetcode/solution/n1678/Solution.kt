package leetcode.solution.n1678

/**
 * [1678. Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/)
 */
class Solution {
    fun interpret(command: String): String {
        val result = StringBuilder()
        var i = 0
        while (i < command.length) {
            when (command[i++]) {
                'G' -> result.append('G')
                '(' -> when {
                    command[i++] == ')' -> result.append('o')
                    else -> {
                        result.append("al")
                        i += 2
                    }
                }
            }
        }
        return result.toString()
    }
}