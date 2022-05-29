package leetcode.solution.n559

/**
 * [559. Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/)
 */
class Solution {
    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        return (root.children.maxOfOrNull { maxDepth(it) } ?: 0) + 1
    }
}

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}