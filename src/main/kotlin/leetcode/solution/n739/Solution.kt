package leetcode.solution.n739

import java.util.LinkedList

/**
 * [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
 */
class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = LinkedList<Pair<Int, Int>>()
        val result = IntArray(temperatures.size)
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > stack.peek().first) {
                val j = stack.pop().second
                result[j] = i - j
            }
            stack.push(temperatures[i] to i)
        }
        return result
    }
}