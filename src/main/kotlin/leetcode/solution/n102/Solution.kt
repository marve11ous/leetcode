package leetcode.solution.n102

import leetcode.util.TreeNode

/**
 * 102. Binary Tree Level Order Traversal
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        levelOrder(root, 0, result)
        return result
    }

    private fun levelOrder(root: TreeNode?, depth: Int, result: ArrayList<ArrayList<Int>>) {
        if (root == null) {
            return
        }
        if (result.size <= depth) {
            result.add(ArrayList())
        }
        result[depth].add(root.`val`)
        levelOrder(root.left, depth + 1, result)
        levelOrder(root.right, depth + 1, result)
    }
}