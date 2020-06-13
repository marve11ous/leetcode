package solution

import org.junit.Assert.assertEquals
import org.junit.Test
import solution.medium.n227.Solution

class Solution227Test {

    private val solution = Solution()
    private val solve = { s: String -> solution.calculate(s) }

    private fun test(expected: Int, actual: Int) {
        assertEquals(expected, actual)
    }

    @Test
    fun test() {
        test(7, solve("3+2*2"))
        test(1, solve(" 3/2 "))
        test(5, solve(" 3+5 / 2 "))
    }

}