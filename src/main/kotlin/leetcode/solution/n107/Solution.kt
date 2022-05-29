package leetcode.solution.n107

import leetcode.util.TreeNode
import java.util.LinkedList

/**
 * [107. Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)
 */
class Solution {
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val result: LinkedList<List<Int>> = LinkedList()
        val queue = LinkedList<TreeNode>().apply { root?.let { this.offer(it) } }
        while (queue.isNotEmpty()) {
            val list = ArrayList<Int>()
            for (i in 1..queue.size) {
                val node = queue.pop()
                list.add(node.`val`)
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result.addFirst(list)
        }
        return result
    }
}