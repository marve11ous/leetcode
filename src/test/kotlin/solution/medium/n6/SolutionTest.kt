package solution.medium.n6

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3))
    }

    @Test
    fun test2() {
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4))
    }

    @Test
    fun test3() {
        assertEquals("A", solution.convert("A", 1))
    }
}