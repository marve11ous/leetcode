package leetcode.solution.n264

import java.util.*

/**
 * [264. Ugly Number II](https://leetcode.com/problems/ugly-number-ii/)
 */
class Solution {
    private companion object {
        private val multipliers = longArrayOf(2, 3, 5)
    }

    fun nthUglyNumber(n: Int): Int {
        if (n > 1) {
            val pq = PriorityQueue<Int>().apply { add(1) }
            var i = 0
            var num = 0
            while (pq.isNotEmpty()) {
                while (num == pq.peek()) pq.poll()
                num = pq.poll()
                if (++i == n) return num
                multipliers.forEach { pq.add(num * it) }
            }
        }
        return 1
    }

    private fun PriorityQueue<Int>.add(num: Long) {
        if (num <= Int.MAX_VALUE) add(num.toInt())
    }

}