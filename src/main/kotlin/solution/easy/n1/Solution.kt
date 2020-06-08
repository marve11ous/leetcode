class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val tmp = HashMap<Int, Int>()
        for (i in nums.indices) {
            val a = nums[i]
            val j = tmp[target - a]
            if (j != null) {
                return intArrayOf(j, i)
            }
            tmp[a] = i
        }
        return intArrayOf()
    }
}