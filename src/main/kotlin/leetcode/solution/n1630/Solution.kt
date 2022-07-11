package leetcode.solution.n1630

import java.util.*

/**
 * [1630. Arithmetic Subarrays](https://leetcode.com/problems/arithmetic-subarrays/)
 */
class Solution {
    fun checkArithmeticSubarrays(nums: IntArray, l: IntArray, r: IntArray): List<Boolean> {
        val pq = PriorityQueue<Int>()
        val result = ArrayList<Boolean>()
        for (i in l.indices) {
            for (j in l[i]..r[i]) pq.add(nums[j])
            val first = pq.poll()
            val diff = pq.poll() - first
            var s = 1
            while (pq.isNotEmpty() && pq.peek() - first == ++s * diff) pq.poll()
            result.add(pq.isEmpty())
            pq.clear()
        }
        return result
    }
}