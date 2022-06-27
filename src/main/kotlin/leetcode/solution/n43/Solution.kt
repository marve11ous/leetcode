package leetcode.solution.n43

/**
 * [43. Multiply Strings](https://leetcode.com/problems/multiply-strings/)
 */
class Solution {
    fun multiply(num1: String, num2: String): String {
        val result = IntArray(num1.length + num2.length + 1)
        for (i in num1.indices) {
            val d1 = num1[num1.length - i - 1].digit()
            for (j in num2.indices) {
                val d2 = num2[num2.length - j - 1].digit()
                result[i + j] += d1 * d2
                result[i + j + 1] += result[i + j] / 10
                result[i + j] %= 10
            }
        }
        var i = result.size - 1
        while (i >= 0 && result[i] == 0) i--
        if (i < 0) return "0"
        return String(CharArray(i + 1) { '0' + result[i - it] })
    }

    private fun Char.digit(): Int = Character.digit(this, 10)
}