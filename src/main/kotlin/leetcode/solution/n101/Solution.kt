package leetcode.solution.n101

import leetcode.util.TreeNode

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
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }

    private fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if (t1 == null && t2 == null) return true
        if (t1 == null || t2 == null) return false
        return t1.`val` == t2.`val` && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right)
    }
}