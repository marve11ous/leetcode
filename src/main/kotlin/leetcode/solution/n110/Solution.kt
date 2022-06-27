package leetcode.solution.n110

import leetcode.util.TreeNode
import kotlin.math.abs
import kotlin.math.max

/**
 * [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)
 */
class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        return abs(root.left.depth() - root.right.depth()) <= 1 && isBalanced(root.left) && isBalanced(root.right)
    }

    private fun TreeNode?.depth(): Int {
        if (this == null) return 0
        return 1 + max(this.left.depth(), this.right.depth())
    }
}