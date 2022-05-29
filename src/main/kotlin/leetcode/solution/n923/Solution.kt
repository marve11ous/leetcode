package leetcode.solution.n923


/**
 * [923. 3Sum With Multiplicity](https://leetcode.com/problems/3sum-with-multiplicity/)
 */
class Solution {
    companion object {
        const val MOD = 1000000007
    }

    fun threeSumMulti(arr: IntArray, target: Int): Int {
        val map: MutableMap<Int, Int> = HashMap()

        var result = 0
        arr.forEachIndexed { i, num ->
            result = (result + (map[target - num] ?: 0)) % MOD
            (0 until i).map { num + arr[it] }.forEach { map[it] = (map[it] ?: 0) + 1 }
        }
        return result
    }
}