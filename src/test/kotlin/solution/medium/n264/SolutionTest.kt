package solution.medium.n264

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @CsvSource("1,1", "10,12", "20,36", "1690,2123366400")
    fun test(n: Int, expected: Int) {
        assertEquals(expected, solution.nthUglyNumber(n))
    }

}