package solution.medium.n46

import java.util.*

/**
 * 46. Permutations
 *
 * Given a collection of distinct integers, return all possible permutations.
 */
class Solution1 {

    fun permute(nums: IntArray): List<List<Int>> {
        return permuteInternal(nums.toHashSet())
    }

    private fun permuteInternal(nums: HashSet<Int>): ArrayList<LinkedList<Int>> {
        val result = ArrayList<LinkedList<Int>>()
        if (nums.size == 1) {
            val numList = LinkedList<Int>()
            numList.offer(nums.iterator().next())
            result.add(numList)
            return result
        }
        for (num in nums) {
            val numSet = nums.toHashSet()
            numSet.remove(num)
            permuteInternal(numSet).forEach {
                it.addFirst(num)
                result.add(it)
            }
        }
        return result
    }
}