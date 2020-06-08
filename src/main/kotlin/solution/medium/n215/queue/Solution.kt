package solution.medium.n215.queue

import java.util.*

class Solution {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>(k)
        for (num in nums) {
            pq.add(num)
            if (pq.size > k) {
                pq.poll()
            }
        }
        return pq.peek() ?: 0
    }

}