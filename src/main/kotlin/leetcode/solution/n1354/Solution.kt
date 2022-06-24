package leetcode.solution.n1354

import java.util.*

/**
 * [1354. Construct Target Array With Multiple Sums](https://leetcode.com/problems/construct-target-array-with-multiple-sums/)
 */
class Solution {
    fun isPossible(target: IntArray): Boolean {
        if (target.size == 1) return target[0] == 1
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var sum = 0
        target.forEach {
            pq.add(it)
            sum += it
        }
        while (pq.peek() != 1 && sum != pq.peek() + 1) {
            val max = pq.poll()
            val x = max % (sum - max)
            sum -= max - x
            if (x == 0 || x == max) return false
            pq.add(x)
        }

        return true
    }
}