package leetcode.solution.n1557

/**
 * [1557. Minimum Number of Vertices to Reach All Nodes](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)
 */
class Solution {
    fun findSmallestSetOfVertices(n: Int, edges: List<List<Int>>): List<Int> {
        val nonRoot = BooleanArray(n)
        edges.forEach { nonRoot[it[1]] = true }
        return nonRoot.indices.filter { !nonRoot[it] }
    }
}