package leetcode.solution.n208

/**
 * 208. Implement Trie (Prefix Tree)
 *
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Note:
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */

class Trie {
    private val root = Node()

    fun insert(word: String) {
        var current = root
        for (ch in word) {
            current = current.child.computeIfAbsent(ch) { Node() }
        }
        current.word = word
    }

    fun search(word: String): Boolean {
        var current: Node? = root
        for (ch in word) {
            if (current == null) {
                return false
            }
            current = current.child[ch]
        }
        return current?.word == word
    }

    fun startsWith(prefix: String): Boolean {
        var current: Node? = root
        for (ch in prefix) {
            if (current == null) {
                return false
            }
            current = current.child[ch]
        }
        return current != null
    }

    class Node {
        val child = HashMap<Char, Node>()
        var word: String? = null
    }

}