package solution.medium.n1209

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author AShkabara
 */
internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals("abcd", solution.removeDuplicates("abcd", 2))
    }

    @Test
    fun test2() {
        assertEquals("aa", solution.removeDuplicates("deeedbbcccbdaa", 3))
    }

    @Test
    fun test3() {
        assertEquals("ps", solution.removeDuplicates("pbbcggttciiippooaais", 2))
    }
}