package leetcode.solution.n102

import leetcode.util.TreeNode
import java.util.*

/**
 * [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val queue = LinkedList<TreeNode>()
        if (root != null) queue.offer(root)
        val result = ArrayList<List<Int>>()
        while (queue.isNotEmpty()) {
            var size = queue.size
            val level = ArrayList<Int>(size)
            while (size-- > 0) {
                val node = queue.poll()
                level.add(node.`val`)
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result.add(level)
        }
        return result
    }
}