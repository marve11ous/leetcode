package leetcode.solution.n2286

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class BookMyShowTest {

    @Test
    fun test1() {
        val bookMyShow = BookMyShow(2, 5)
        assertIterableEquals(listOf(0, 0), bookMyShow.gather(4, 0).asIterable())
        assertTrue(bookMyShow.gather(2, 0).isEmpty())
        assertTrue(bookMyShow.scatter(5, 1))
        assertFalse(bookMyShow.scatter(5, 1))
    }

    @Test
    fun test2() {
        val bookMyShow = BookMyShow(5, 9)
        assertTrue(bookMyShow.gather(10, 1).isEmpty())
        assertTrue(bookMyShow.scatter(3, 3))
        assertIterableEquals(listOf(1, 0), bookMyShow.gather(9, 1).asIterable())
        assertTrue(bookMyShow.gather(10, 2).isEmpty())
        assertIterableEquals(listOf(0, 3), bookMyShow.gather(2, 0).asIterable())
    }

    @Test
    fun test3() {
        val bookMyShow = BookMyShow(5, 10)
        assertTrue(bookMyShow.scatter(9, 1))
        assertTrue(bookMyShow.scatter(1, 3))
        assertIterableEquals(listOf(1, 0), bookMyShow.gather(3, 4).asIterable())
        assertIterableEquals(listOf(1, 3), bookMyShow.gather(1, 1).asIterable())
        assertIterableEquals(listOf(2, 0), bookMyShow.gather(10, 4).asIterable())
    }

    @Test
    fun test4() {
        val bookMyShow = BookMyShow(18, 48)
        assertTrue(bookMyShow.scatter(24, 13))
        assertTrue(bookMyShow.scatter(12, 5))
        assertIterableEquals(listOf(0, 36), bookMyShow.gather(12, 5).asIterable())
    }

    @Test
    fun test5() {
        val bookMyShow = BookMyShow(3, 7)
        assertFalse(bookMyShow.scatter(9, 0))
        assertIterableEquals(listOf(0, 0), bookMyShow.gather(2, 2).asIterable())
        assertTrue(bookMyShow.gather(8, 2).isEmpty())
    }

    @Test
    fun test6() {
        val bookMyShow = BookMyShow(3, 999999999)
        assertTrue(bookMyShow.scatter(1000000000, 2))
    }
}