package solution.medium.n284

/**
 * [284. Peeking Iterator](https://leetcode.com/problems/peeking-iterator/)
 */
class PeekingIterator(private val iterator: Iterator<Int>) : Iterator<Int> {
    private var peek: Int? = null

    fun peek(): Int {
        if (peek == null) {
            peek = iterator.next()
        }
        return peek ?: throw NoSuchElementException()
    }

    override fun next(): Int {
        try {
            return peek()
        } finally {
            peek = null
        }
    }

    override fun hasNext(): Boolean {
        return peek != null || iterator.hasNext()
    }
}