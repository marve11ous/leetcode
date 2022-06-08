package leetcode.solution.n653

import leetcode.util.TreeNode

/**
 * [653. Two Sum IV - Input is a BST](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)
 */
class Solution {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val nums = ArrayList<Int>().apply { inorder(root) }
        var l = 0
        var r = nums.size - 1
        while (l < r) {
            when {
                nums[l] + nums[r] == k -> return true
                nums[l] + nums[r] > k -> r--
                else -> l++
            }
        }
        return false
    }

    private fun ArrayList<Int>.inorder(root: TreeNode?) {
        root?.left?.let { inorder(it) }
        root?.`val`?.let { add(it) }
        root?.right?.let { inorder(it) }
    }
}