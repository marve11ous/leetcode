package leetcode.solution.n46

/**
 * [46. Permutations](https://leetcode.com/problems/permutations/)
 */
class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        return ArrayList<List<Int>>().apply { backtrack(LinkedHashSet(nums.size), nums) }
    }

    private fun ArrayList<List<Int>>.backtrack(result: HashSet<Int>, nums: IntArray) {
        if (result.size == nums.size) {
            add(result.toList())
            return
        }
        for (num in nums) {
            if (result.contains(num)) continue
            result.add(num)
            backtrack(result, nums)
            result.remove(num)
        }
    }
}