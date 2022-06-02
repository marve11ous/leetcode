package leetcode.solution.n116

import leetcode.util.Node
import java.util.*

/**
 * [116. Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
 */
class Solution {
    fun connect(root: Node?): Node? {
        val queue = LinkedList<Node>()
        if (root != null) queue.offer(root)
        while (queue.isNotEmpty()) {
            var size = queue.size
            var prev: Node? = null
            while (size-- > 0) {
                val node = queue.poll()
                prev?.next = node
                node?.left?.let { queue.offer(it) }
                node?.right?.let { queue.offer(it) }
                prev = node
            }
        }
        return root
    }
}