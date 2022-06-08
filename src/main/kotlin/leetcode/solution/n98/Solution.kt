package leetcode.solution.n98

import leetcode.util.TreeNode

/**
 * [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
 */
class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        val nums = ArrayList<Int>().apply { inorder(root) }
        for (i in 0 until nums.size - 1) {
            if (nums[i] >= nums[i + 1]) return false
        }
        return true
    }

    private fun ArrayList<Int>.inorder(root: TreeNode?) {
        root?.left?.let { inorder(it) }
        root?.`val`?.let { add(it) }
        root?.right?.let { inorder(it) }
    }
}