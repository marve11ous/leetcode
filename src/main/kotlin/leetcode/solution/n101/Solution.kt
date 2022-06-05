package leetcode.solution.n101

import leetcode.util.TreeNode
import java.util.*


/**
 * [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)
 */
interface Solution {
    fun isSymmetric(root: TreeNode?): Boolean
}

class RecursiveSolution : Solution {
    override fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }

    private fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if (t1 == null && t2 == null) return true
        if (t1 == null || t2 == null) return false
        return t1.`val` == t2.`val` && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right)
    }
}

class IterativeSolution : Solution {

    override fun isSymmetric(root: TreeNode?): Boolean {
        val queue = LinkedList<TreeNode?>()
        if (root != null) queue.offer(root)
        while (queue.isNotEmpty()) {
            var size = queue.size
            val level = Array<Int?>(size) { null }
            while (size-- > 0) {
                queue.poll()?.let {
                    level[size] = it.`val`
                    queue.offer(it.left)
                    queue.offer(it.right)
                }
            }
            if (!level.isSymmetric()) return false
        }
        return true
    }

    private fun Array<Int?>.isSymmetric(): Boolean {
        var l = 0
        var r = size - 1
        while (l < r) {
            if (this[l++] != this[r--]) return false
        }
        return true
    }

}