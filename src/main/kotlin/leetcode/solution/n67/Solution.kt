package leetcode.solution.n67

/**
 * [67. Add Binary](https://leetcode.com/problems/add-binary/)
 */
class Solution {
    fun addBinary(a: String, b: String): String {
        val result = StringBuilder()

        var i = a.length - 1
        var j = b.length - 1
        var sum = 0
        while (i >= 0 || j >= 0) {
            if (i >= 0) sum += a[i--].digit()
            if (j >= 0) sum += b[j--].digit()
            result.append(if (sum % 2 == 0) "0" else "1")
            sum /= 2
        }

        if (sum != 0) result.append("1")

        return result.reverse().toString()
    }

    private fun Char.digit(): Int = Character.digit(this, 10)

}