package leetcode.solution.n2300

/**
 * [2300. Successful Pairs of Spells and Potions](https://leetcode.com/problems/successful-pairs-of-spells-and-potions/)
 */
class Solution {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        potions.sort()
        val result = IntArray(spells.size)
        for (i in spells.indices) {
            var l = 0
            var r = potions.size
            val spell = spells[i].toLong()
            while (l < r) {
                val mid = l + (r - l) / 2
                if (spell * potions[mid] < success) l = mid + 1 else r = mid
            }
            result[i] = potions.size - l
        }
        return result
    }
}