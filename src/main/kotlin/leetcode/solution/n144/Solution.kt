package leetcode.solution.n144

import leetcode.util.TreeNode

/**
 * [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> =
        if (root == null) listOf()
        else (listOf(root.`val`) + preorderTraversal(root.left) + preorderTraversal(root.right))
}