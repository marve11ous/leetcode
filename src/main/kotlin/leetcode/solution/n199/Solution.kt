package leetcode.solution.n199

import leetcode.util.TreeNode
import java.util.*

/**
 * [199. Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)
 */
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
        if (root == null) return listOf()
        val queue = LinkedList<TreeNode>().apply { offer(root) }
        val result = LinkedList<Int>()
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val node = queue.poll()
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
                if (size == 0) result.add(node.`val`)
            }
        }
        return result
    }
}