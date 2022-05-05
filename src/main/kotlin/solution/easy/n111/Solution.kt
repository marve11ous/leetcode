package solution.easy.n111

import kotlin.math.min

/**
 * [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)
 */
class Solution {

    fun minDepth(root: TreeNode?): Int {
        return if (root == null) 0 else minDepth(root, 1)
    }

    private fun minDepth(root: TreeNode?, depth: Int): Int =
        when {
            root == null -> Int.MAX_VALUE
            root.left == null && root.right == null -> depth
            else -> min(minDepth(root.left, depth + 1), minDepth(root.right, depth + 1))
        }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}