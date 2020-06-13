package solution.medium.n22

/**
 * 22. Generate Parentheses
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = ArrayList<String>()
        generate("(", 1, 0, n, result)
        return result
    }

    private fun generate(s: String, open: Int, close: Int, n: Int, result: ArrayList<String>) {
        if (s.length == n * 2) {
            result.add(s)
            return
        }
        if (open < n) {
            generate("$s(", open + 1, close, n, result)
        }
        if (close < open) {
            generate("$s)", open, close + 1, n, result)
        }
    }
}