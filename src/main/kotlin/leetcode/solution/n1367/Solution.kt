package leetcode.solution.n1367

import leetcode.util.ListNode
import leetcode.util.TreeNode
import java.util.LinkedList

/**
 * [1367. Linked List in Binary Tree](https://leetcode.com/problems/linked-list-in-binary-tree/)
 */
class Solution {
    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {
        val queue = LinkedList<TreeNode>()
        if (root != null) queue.offer(root)
        while (queue.isNotEmpty()) {
            val node = queue.poll()
            if (dfs(head, node)) return true
            node.left?.let { queue.offer(it) }
            node.right?.let { queue.offer(it) }
        }
        return false
    }

    private fun dfs(listNode: ListNode?, treeNode: TreeNode?): Boolean {
        if (listNode == null) return true
        if (listNode.`val` == treeNode?.`val`) {
            return dfs(listNode.next, treeNode.left) || dfs(listNode.next, treeNode.right)
        }
        return false
    }
}