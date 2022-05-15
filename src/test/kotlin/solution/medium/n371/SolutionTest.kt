package solution.medium.n371

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(value = ["0,1", "2,3", "2,0", "5,-4"])
    fun getSum(a: Int, b: Int) {
        assertEquals(a + b, solution.getSum(a, b))
    }
}