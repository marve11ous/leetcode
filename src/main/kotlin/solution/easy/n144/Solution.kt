package solution.easy.n144

/**
 * [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> =
        if (root == null) listOf()
        else (listOf(root.`val`) + preorderTraversal(root.left) + preorderTraversal(root.right))
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}