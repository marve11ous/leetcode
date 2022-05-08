package solution.medium.n341

/**
 * [341. Flatten Nested List Iterator](https://leetcode.com/problems/flatten-nested-list-iterator/)
 */
class NestedIterator(nestedList: List<NestedInteger>) {

    private val iterator = ArrayList<Int>().also { ints -> nestedList.forEach { ints.addNested(it) } }.iterator()

    private fun ArrayList<Int>.addNested(ni: NestedInteger) {
        if (ni.isInteger()) ni.getInteger()?.let { this.add(it) } else ni.getList()?.forEach { this.addNested(it) }
    }

    fun next(): Int = iterator.next()

    fun hasNext() = iterator.hasNext()
}

interface NestedInteger {
    /**
     * @return true if this NestedInteger holds a single integer, rather than a nested list.
     */
    fun isInteger(): Boolean

    /**
     * @return the single integer that this NestedInteger holds, if it holds a single integer.
     * Return null if this NestedInteger holds a nested list
     */

    fun getInteger(): Int?

    /**
     * Set this NestedInteger to hold a single integer.
     */
    fun setInteger(value: Int)

    /**
     * Set this NestedInteger to hold a nested list and adds a nested integer to it.
     */
    fun add(ni: NestedInteger)

    /**
     * @return the nested list that this NestedInteger holds, if it holds a nested list.
     * Return null if this NestedInteger holds a single integer
     */
    fun getList(): List<NestedInteger>?
}