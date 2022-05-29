package leetcode.solution.n46

/**
 * 46. Permutations
 *
 * Given a collection of distinct integers, return all possible permutations.
 */
class Solution2 {

    fun permute(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        dfs(ArrayList(), Array(nums.size) { false }, nums, result)
        return result
    }

    private fun dfs(path: ArrayList<Int>, used: Array<Boolean>, nums: IntArray, result: ArrayList<List<Int>>) {
        if (path.size == nums.size) {
            result.add(path.toList())
            return
        }
        for ((i, num) in nums.withIndex()) {
            if (used[i]) {
                continue
            }
            used[i] = true
            path.add(num)
            dfs(path, used, nums, result)
            path.removeAt(path.size - 1)
            used[i] = false
        }
    }
}