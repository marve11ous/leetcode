package leetcode.solution.n341

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class NestedIteratorTest {

    @Test
    fun test1() {
        val iterator = NestedIterator(
            listOf(
                TestNestedInteger(1),
                TestNestedInteger(2),
                TestNestedInteger(3),
            )
        )
        intArrayOf(1, 2, 3).forEach {
            assertTrue { iterator.hasNext() }
            assertEquals(it, iterator.next())
        }
    }

    @Test
    fun test2() {
        val iterator = NestedIterator(
            listOf(
                TestNestedInteger(
                    list = listOf(
                        TestNestedInteger(1),
                        TestNestedInteger(1)
                    )
                ),
                TestNestedInteger(2),
                TestNestedInteger(
                    list = listOf(
                        TestNestedInteger(1),
                        TestNestedInteger(1)
                    )
                ),
            )
        )
        intArrayOf(1, 1, 2, 1, 1).forEach {
            assertTrue { iterator.hasNext() }
            assertEquals(it, iterator.next())
        }
    }


}

internal class TestNestedInteger(private var int: Int? = null, private var list: List<NestedInteger>? = null) :
    NestedInteger {

    override fun isInteger(): Boolean = int != null

    override fun getInteger(): Int? = int

    override fun setInteger(value: Int) {
        int = value
    }

    override fun add(ni: NestedInteger) {
        val temp = list?.toMutableList()
        temp?.add(ni)
        list = temp
    }

    override fun getList(): List<NestedInteger>? = list
}