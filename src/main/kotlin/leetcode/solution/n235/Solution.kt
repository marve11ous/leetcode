package leetcode.solution.n235

import leetcode.util.TreeNode

/**
 * [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
 */
class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        return when {
            root.compareTo(p) > 0 && root.compareTo(q) > 0 -> lowestCommonAncestor(root?.left, p, q)
            root.compareTo(p) < 0 && root.compareTo(q) < 0 -> lowestCommonAncestor(root?.right, p, q)
            else -> root
        }
    }

    private fun TreeNode?.compareTo(node: TreeNode?): Int {
        return (this?.`val` ?: 0) - (node?.`val` ?: 0)
    }
}