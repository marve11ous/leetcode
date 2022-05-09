package solution.medium.n173

/**
 * [173. Binary Search Tree Iterator](https://leetcode.com/problems/binary-search-tree-iterator/)
 */
class BSTIterator(private val root: TreeNode?) {

    private var order = Order.L
    private var nested: BSTIterator? = null

    fun next(): Int {
        if (hasNext()) {
            nested?.next()?.apply { return this }
            order = Order.R
            nested = root?.right?.let { BSTIterator(it) }
            root?.`val`?.apply { return this }
        }
        throw NoSuchElementException()
    }

    fun hasNext(): Boolean {
        if (nested?.hasNext() == true) return true
        nested = null
        when (order) {
            Order.L -> {
                nested = root?.left?.let { BSTIterator(it) }
                order = Order.N
            }
            Order.N -> return root != null
            Order.R -> return false
        }
        return hasNext()
    }

    enum class Order { L, N, R }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}