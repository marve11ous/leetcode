package leetcode.solution.n145

import leetcode.util.TreeNode

/**
 * [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
 */
class Solution {
    fun postorderTraversal(root: TreeNode?, result: ArrayList<Int> = ArrayList()): List<Int> {
        root?.left?.let { postorderTraversal(it, result) }
        root?.right?.let { postorderTraversal(it, result) }
        root?.let { result.add(it.`val`) }
        return result
    }
}