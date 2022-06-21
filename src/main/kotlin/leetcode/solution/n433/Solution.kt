package leetcode.solution.n433

import java.util.*

/**
 * [433. Minimum Genetic Mutation](https://leetcode.com/problems/minimum-genetic-mutation/)
 */
class Solution {
    private val chars = arrayOf('A', 'C', 'G', 'T')

    fun minMutation(start: String, end: String, bank: Array<String>): Int {
        val set = HashSet(bank.toSet())
        if (!set.contains(end)) return -1
        val queue = LinkedList<String>()
        queue.offer(start)
        var result = 1
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val str = queue.poll()
                for (i in str.indices) {
                    chars.forEach {
                        val mutation = String(str.toCharArray().apply { this[i] = it })
                        if (set.contains(mutation)) {
                            set.remove(mutation)
                            if (mutation == end) return result
                            queue.offer(mutation)
                        }
                    }
                }
            }
            result++
        }
        return -1
    }
}