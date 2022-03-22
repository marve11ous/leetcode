package solution.medium.n227

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

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