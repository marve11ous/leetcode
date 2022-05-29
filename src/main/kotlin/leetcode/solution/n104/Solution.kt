package leetcode.solution.n104

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
import leetcode.util.TreeNode
import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return getDepth(root)
    }

    private fun getDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        return max(getDepth(root.left), getDepth(root.right)) + 1
    }
}