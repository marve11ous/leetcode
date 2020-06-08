package solution.medium.n17

class Solution {

    companion object {
        val phone = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )
    }

    fun letterCombinations(digits: String): List<String> {
        var result: List<String> = emptyList()
        for (digit in digits) {
            result = process(digit, result)
        }
        return result
    }

    private fun process(digit: Char, result: List<String>): List<String> {
        val letters = phone[digit] ?: return result
        val n = result.size
        val next = ArrayList<String>()
        if (result.isEmpty()) {
            for (letter in letters) {
                next.add(letter.toString())
            }
        } else {
            for (i in 0 until n) {
                for (letter in letters) {
                    next.add(result[i] + letter)
                }
            }
        }
        return next
    }

}