package solution.medium.n173

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class BSTIteratorTest {

    @Test
    fun test1() {
        val root = TreeNode(2)
        root.left = TreeNode(1)
        root.right = TreeNode(4)
        root.right?.left = TreeNode(3)
        root.right?.right = TreeNode(5)
        val iterator = BSTIterator(root)
        (1..5).forEach {
            assertTrue(iterator.hasNext())
            assertEquals(it, iterator.next())
        }
    }
}