package leetcode.solution.n117

import leetcode.util.Node
import java.util.*

/**
 * [117. Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)
 */
class Solution {
    fun connect(root: Node?): Node? {
        if (root != null) {
            val queue = LinkedList<Node>().apply { offer(root) }
            while (queue.isNotEmpty()) {
                val size = queue.size
                var prev: Node? = null
                for (i in 0 until size) {
                    val next = queue.pollAndOfferNext()
                    prev?.next = next
                    prev = next
                }
            }
        }
        return root
    }
}

private fun LinkedList<Node>.pollAndOfferNext(): Node =
    poll().apply { left?.let { offer(it) }; right?.let { offer(it) } }
