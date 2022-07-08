package leetcode.solution.n968

import leetcode.util.TreeNode

/**
 * [968. Binary Tree Cameras](https://leetcode.com/problems/binary-tree-cameras/)
 */
class Solution {
    private var covered = HashSet<TreeNode>()
    private var result = 0

    fun minCameraCover(root: TreeNode?): Int {
        result = 0
        covered.clear()
        dfs(root, null)
        return result
    }

    private fun dfs(root: TreeNode?, parent: TreeNode?) {
        if (root != null) {
            dfs(root.left, root)
            dfs(root.right, root)

            if (parent == null && !root.isCovered() || !root.left.isCovered() || !root.right.isCovered()) {
                result++
                covered.add(root)
                covered.add(parent)
                covered.add(root.left)
                covered.add(root.right)
            }
        }
    }

    private fun TreeNode?.isCovered(): Boolean = this == null || covered.contains(this)

    private fun HashSet<TreeNode>.add(node: TreeNode?) {
        if (node != null) add(node)
    }
}