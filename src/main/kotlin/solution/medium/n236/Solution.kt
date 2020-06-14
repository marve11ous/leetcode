package solution.medium.n236

import solution.util.TreeNode

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 *
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as
 * the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 *
 * Note:
 * All of the nodes' values will be unique.
 * p and q are different and both values will exist in the binary tree.
 */

class Solution {

    private var result: TreeNode? = null

    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        contains(root, p, q)
        return result
    }

    private fun contains(root: TreeNode?, p: TreeNode?, q: TreeNode?): Boolean {
        if (root == null || this.result != null) {
            return false
        }
        var result = 0
        if (contains(root.left, p, q)) {
            result++
        }
        if (contains(root.right, p, q)) {
            result++
        }
        if (root.`val` == p?.`val` || root.`val` == q?.`val`) {
            result++
        }
        if (result == 2) {
            this.result = root
        }
        return result > 0
    }
}