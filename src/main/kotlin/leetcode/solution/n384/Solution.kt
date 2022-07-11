package leetcode.solution.n384

import java.util.*

/**
 * [384. Shuffle an Array](https://leetcode.com/problems/shuffle-an-array/)
 */
class Solution(private val nums: IntArray) {
    private var array = nums.clone()
    private val random = Random()

    fun reset(): IntArray = nums.clone().apply { array = this }

    fun shuffle(): IntArray = array.apply {
        for (i in indices) {
            val j = i + random.nextInt(size - i)
            this[i].let {
                this[i] = this[j]
                this[j] = it
            }
        }
    }

}
