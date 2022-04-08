package solution.easy.n703

import java.util.*


/**
 * [703. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
 */
class KthLargest(private val k: Int, nums: IntArray) {
    private val pq: PriorityQueue<Int> = PriorityQueue()

    init {
        nums.forEach { pq.offer(it) }
        while (pq.size > k) pq.poll()
    }

    fun add(value: Int): Int {
        pq.offer(value)
        if (pq.size > k) pq.poll()
        return pq.peek()
    }

}