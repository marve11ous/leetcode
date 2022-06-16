package leetcode.solution.n104

/**
 * [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
 */
import leetcode.util.TreeNode
import java.util.*
import kotlin.math.max

interface Solution {
    fun maxDepth(root: TreeNode?): Int
}

class RecursiveSolution : Solution {

    override fun maxDepth(root: TreeNode?): Int {
        return maxDepth(root, 1)
    }

    private fun maxDepth(root: TreeNode?, depth: Int): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return depth
        return max(maxDepth(root.left, depth + 1), maxDepth(root.right, depth + 1))
    }
}

class IterativeSolution : Solution {
    override fun maxDepth(root: TreeNode?): Int {
        val queue = LinkedList<TreeNode>()
        if (root != null) queue.offer(root)
        var result = 0
        while (queue.isNotEmpty()) {
            var size = queue.size
            while (size-- > 0) {
                val node = queue.poll()
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            result++
        }
        return result
    }
}