package solution.medium.n491

class Solution {
    private lateinit var nums: IntArray
    private lateinit var dp: HashMap<Int, List<List<Int>>>

    fun findSubsequences(nums: IntArray): List<List<Int>> {
        if (nums.size < 2) {
            return emptyList()
        }
        this.nums = nums
        val result = HashSet<List<Int>>()
        dp = HashMap()
        dp[0] = listOf(listOf(nums[0]))
        for (i in nums.indices) {
            result.addAll(dp(i))
        }
        return result.filter { it.size >= 2 }
    }

    private fun dp(i: Int): List<List<Int>> {
        val current = dp[i]
        if (current != null) {
            return current
        }
        val result = ArrayList<List<Int>>()
        result.add(listOf(nums[i]))
        for (j in 0 until i) {
            if (nums[i] < nums[j]) {
                continue
            }
            dp(j).forEach { list ->
                val newList = list.toMutableList()
                newList.add(nums[i])
                result.add(newList)
            }
        }
        dp[i] = result
        return result
    }

    private fun max(a: Int, b: Int) = if (a < b) b else a
}