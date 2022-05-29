package leetcode.solution.n225

import java.util.*

/**
 * [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)
 */
class MyStack() {

    private val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.add(x)
        for (i in queue.size downTo 2) {
            queue.add(queue.remove())
        }
    }

    fun pop(): Int {
        return queue.remove()
    }

    fun top(): Int {
        return queue.peek()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}