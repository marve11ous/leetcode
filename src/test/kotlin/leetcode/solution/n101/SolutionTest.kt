package leetcode.solution.n101

import leetcode.util.TreeNode
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import kotlin.test.assertFalse

enum class Solutions(private val solution: Solution) : Solution {
    RECURSIVE(RecursiveSolution()), ITERATIVE(IterativeSolution());

    override fun isSymmetric(root: TreeNode?): Boolean = solution.isSymmetric(root)
}

internal class SolutionTest {

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test1(solution: Solution) {
        assertTrue(solution.isSymmetric(
            TreeNode(1).apply {
                left = TreeNode(2).apply {
                    left = TreeNode(3)
                    right = TreeNode(4)
                }
                right = TreeNode(2).apply {
                    left = TreeNode(4)
                    right = TreeNode(3)
                }
            }
        ))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test2(solution: Solution) {
        assertTrue(solution.isSymmetric(TreeNode(1)))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test3(solution: Solution) {
        assertFalse(solution.isSymmetric(
            TreeNode(1).apply {
                left = TreeNode(2)
                right = TreeNode(3)
            }
        ))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test4(solution: Solution) {
        assertTrue(solution.isSymmetric(
            TreeNode(1).apply {
                left = TreeNode(2).apply {
                    right = TreeNode(4)
                }
                right = TreeNode(2).apply {
                    left = TreeNode(4)
                }
            }
        ))
    }

    @ParameterizedTest
    @EnumSource(Solutions::class)
    fun test5(solution: Solution) {
        assertFalse(solution.isSymmetric(
            TreeNode(2).apply {
                left = TreeNode(3).apply {
                    left = TreeNode(4)
                    right = TreeNode(5).apply {
                        left = TreeNode(8)
                        right = TreeNode(9)
                    }
                }
                right = TreeNode(3).apply {
                    left = TreeNode(5)
                    right = TreeNode(4).apply {
                        left = TreeNode(9)
                        right = TreeNode(8)
                    }
                }
            }
        ))
    }
}