package solution.medium.n437

/**
 * [437. Path Sum III](https://leetcode.com/problems/path-sum-iii/)
 */
class Solution {
    private var result = 0

    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        path(root, targetSum)
        return result
    }

    private fun path(root: TreeNode?, targetSum: Int): List<Int> {
        if (root == null) return listOf()
        val sums = (listOf(0) + path(root.left, targetSum) + path(root.right, targetSum)).map { it + root.`val` }
        result += sums.count { it == targetSum }
        return sums
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}