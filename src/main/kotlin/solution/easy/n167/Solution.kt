package solution.easy.n167

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val tmp = HashMap<Int, Int>()
        for (i in nums.indices) {
            val a = nums[i]
            val j = tmp[target - a]
            if (j != null) {
                return intArrayOf(j + 1, i + 1)
            }
            tmp[a] = i
        }
        return intArrayOf()
    }
}