package solution.medium.n1302

import solution.util.TreeNode
import java.util.*

/**
 * [1302. Deepest Leaves Sum](https://leetcode.com/problems/deepest-leaves-sum/)
 */
interface Solution {
    fun deepestLeavesSum(root: TreeNode?): Int
}

class SolutionQueue : Solution {
    override fun deepestLeavesSum(root: TreeNode?): Int {
        val queue = LinkedList<TreeNode>().apply { root?.let { offer(it) } }
        var result = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            result = 0
            for (i in 0 until size) {
                val node = queue.poll()
                if (node.left == null && node.right == null) result += node.`val`
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
        }
        return result
    }

}

class SolutionRecursive : Solution {
    override fun deepestLeavesSum(root: TreeNode?): Int {
        val depths = TreeMap<Int, Int>()
        deepestLeavesSum(0, root, depths)
        return depths.lastEntry().value
    }

    private fun deepestLeavesSum(deep: Int, root: TreeNode?, depths: TreeMap<Int, Int>) {
        val hasLeft = root?.left != null
        val hasRight = root?.right != null
        if (!hasLeft && !hasRight) {
            root?.`val`?.let { value -> depths.compute(deep) { _, v -> if (v == null) value else v + value } }
            return
        }
        if (hasLeft) deepestLeavesSum(deep + 1, root?.left, depths)
        if (hasRight) deepestLeavesSum(deep + 1, root?.right, depths)
    }
}