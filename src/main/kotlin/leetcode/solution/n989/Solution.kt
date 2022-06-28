package leetcode.solution.n989

import java.util.*

/**
 * [989. Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
 */
class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val result = LinkedList<Int>()
        var o = k
        var i = num.size
        var sum = 0
        while (sum > 0 || o > 0 || i > 0) {
            if (--i >= 0) sum += num[i]
            if (o > 0) sum += o % 10
            result.addFirst(sum % 10)
            sum /= 10
            o /= 10
        }
        return result
    }
}