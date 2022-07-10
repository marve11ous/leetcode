package leetcode.solution.n860

/**
 * [860. Lemonade Change](https://leetcode.com/problems/lemonade-change/)
 */
class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var five = 0
        var ten = 0
        bills.forEach {
            when (it) {
                5 -> five++
                10 -> if (five-- == 0) return false else ten++
                20 -> when {
                    ten > 0 && five > 0 -> {
                        ten--
                        five--
                    }
                    five >= 3 -> five -= 3
                    else -> return false
                }
            }
        }
        return true
    }
}