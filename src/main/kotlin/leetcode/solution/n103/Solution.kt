package leetcode.solution.n103

import leetcode.util.TreeNode
import java.util.*

/**
 * [103. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
 */
class Solution {
    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        var reverse = false
        val result: MutableList<List<Int>> = ArrayList()
        val queue = LinkedList<TreeNode>().apply { root?.let { this.offer(it) } }
        while (queue.isNotEmpty()) {
            val list = LinkedList<Int>()
            for (i in 1..queue.size) {
                val node = queue.pop()
                if (reverse) list.addFirst(node.`val`) else list.addLast(node.`val`)
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result.add(list)
            reverse = !reverse
        }
        return result
    }
}