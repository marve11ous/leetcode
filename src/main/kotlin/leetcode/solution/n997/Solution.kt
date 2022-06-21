package leetcode.solution.n997

/**
 * [997. Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)
 */
class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val trusted = HashMap<Int, HashSet<Int>>()
        val trustsAny = BooleanArray(n + 1)
        trust.forEach {
            trusted.computeIfAbsent(it[1]) { HashSet() }.add(it[0])
            trustsAny[it[0]] = true
        }
        return (1..n).firstOrNull { !trustsAny[it] && (trusted[it]?.size ?: 0) == n - 1 } ?: -1
    }
}