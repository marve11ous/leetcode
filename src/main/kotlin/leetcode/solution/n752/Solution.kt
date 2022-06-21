package leetcode.solution.n752

import java.util.*

/**
 * [752. Open the Lock](https://leetcode.com/problems/open-the-lock/)
 */
class Solution {
    private val dir = intArrayOf(1, -1)

    fun openLock(deadends: Array<String>, target: String): Int {
        if (target == "0000") return 0
        val visited = deadends.toMutableSet()
        val queue = LinkedList<String>()
        queue.offer("0000")
        var result = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val str = queue.poll()
                if (visited.contains(str)) continue
                visited.add(str)
                for (i in str.indices) {
                    val charArray = str.toCharArray()
                    val d = Character.digit(str[i], 10)
                    dir.map { charArray.replace(d + it, i) }
                        .forEach {
                            if (it == target) return result
                            if (!visited.contains(it)) queue.offer(it)
                        }
                }
            }
            result++
        }
        return -1
    }

    private fun CharArray.replace(digit: Int, i: Int): String {
        this[i] = '0' + (if (digit < 0) digit + 10 else digit % 10)
        return String(this)
    }

}