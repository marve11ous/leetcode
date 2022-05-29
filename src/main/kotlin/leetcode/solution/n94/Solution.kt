package leetcode.solution.n94

import leetcode.util.TreeNode

/**
 * 94. Binary Tree Inorder Traversal
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 */
class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = ArrayList<Int>()
        inorderTraversal(root, result)
        return result
    }

    private fun inorderTraversal(root: TreeNode?, result: MutableList<Int>) {
        if (root == null) {
            return
        }
        root.left?.let { left -> inorderTraversal(left, result) }
        result.add(root.`val`)
        root.right?.let { right -> inorderTraversal(right, result) }
    }
}