package leetcode.solution.n1376

/**
 * [1376. Time Needed to Inform All Employees](https://leetcode.com/problems/time-needed-to-inform-all-employees/)
 */
class Solution {
    fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
        val tree = HashMap<Int, HashSet<Int>>()
        for (i in manager.indices) {
            tree.computeIfAbsent(manager[i]) { HashSet() }.add(i)
        }
        return dfs(headID, n, tree, informTime, 0)
    }
}

private fun dfs(i: Int, n: Int, tree: Map<Int, Set<Int>>, informTime: IntArray, time: Int): Int {
    var result = time
    if (i < n) {
        tree[i]?.forEach {
            result = result.coerceAtLeast(dfs(it, n, tree, informTime, time + informTime[i]))
        }
    }
    return result
}