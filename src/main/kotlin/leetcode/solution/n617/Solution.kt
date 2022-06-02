package leetcode.solution.n617

import leetcode.util.TreeNode

/**
 * [617. Merge Two Binary Trees](https://leetcode.com/problems/merge-two-binary-trees/)
 */
class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null
        val merged = TreeNode((root1?.`val` ?: 0) + (root2?.`val` ?: 0))
        merged.left = mergeTrees(root1?.left, root2?.left)
        merged.right = mergeTrees(root1?.right, root2?.right)
        return merged
    }
}