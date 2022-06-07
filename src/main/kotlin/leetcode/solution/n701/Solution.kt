package leetcode.solution.n701

import leetcode.util.TreeNode

/**
 * [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/)
 */
class Solution {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode {
        when {
            root == null -> return TreeNode(`val`)
            root.`val` > `val` -> root.left = insertIntoBST(root.left, `val`)
            else -> root.right = insertIntoBST(root.right, `val`)
        }
        return root
    }
}