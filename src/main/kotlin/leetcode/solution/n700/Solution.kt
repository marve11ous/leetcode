package leetcode.solution.n700

import leetcode.util.TreeNode

/**
 * [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)
 */
class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return when {
            root == null || root.`val` == `val` -> root
            root.`val` > `val` -> searchBST(root.left, `val`)
            else -> searchBST(root.right, `val`)
        }
    }
}