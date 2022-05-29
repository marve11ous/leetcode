package leetcode.solution.n12

class Solution {
    companion object {
        val digits = linkedMapOf(
            1000 to "M",
            500 to "D",
            100 to "C",
            50 to "L",
            10 to "X",
            5 to "V",
            1 to "I"
        )
        val multipliers = listOf(1000, 500, 100, 50, 10, 5, 1)
    }

    fun intToRoman(num: Int): String {
        var result = ""
        var tmp = num
        var i = 0
        while (i in multipliers.indices) {
            val multiplier = multipliers[i]
            val count = tmp / multiplier
            tmp %= multiplier
            val digit = digits[multiplier]
            if (count == 4) {
                result += digit + digits[multipliers[i++ - 1]]
                continue
            }
            if (count == 1 && i + 1 < multipliers.size) {
                val nextMultiplier = multipliers[i + 1]
                val nextCount = tmp / nextMultiplier
                if (nextCount == 4) {
                    tmp %= nextMultiplier
                    result += digits[nextMultiplier] + digits[multipliers[i - 1]]
                    i += 2
                    continue
                }
            }
            for (j in 0 until count) {
                result += digit
            }
            i++
        }
        return result
    }
}