package solution.easy.n13

class Solution {
    companion object {
        private val digits = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
    }

    fun romanToInt(s: String): Int {
        var result = 0
        var lastValue = 0
        for (i in s.length - 1 downTo 0) {
            val currentChar = s[i]
            val currentValue = digits.getValue(currentChar)
            if (currentValue < lastValue) {
                result -= currentValue
            } else {
                result += currentValue
                lastValue = currentValue
            }
        }
        return result
    }
}