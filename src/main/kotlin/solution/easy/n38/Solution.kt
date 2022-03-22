package solution.easy.n38

import java.math.BigInteger

class Solution {
    fun countAndSay(n: Int): String {
        var result: BigInteger = BigInteger.ONE
        for (i in 1 until n) {
            result = count(result).toBigInteger()
        }
        return result.toString()
    }

    private fun count(num: BigInteger): String {
        if (num.compareTo(BigInteger.ONE) == 0) {
            return "11"
        }
        val it = num.toString().iterator()
        var result = ""
        var cnt = 0
        var value: Char? = null
        while (it.hasNext()) {
            val next = it.next()
            if (value != null && value != next) {
                result += cnt.toString() + value
                cnt = 0
            }
            value = next
            cnt++
        }
        result += cnt.toString() + value
        return result
    }
}