package solution.medium.n146

/**
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations:
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
 * it should invalidate the least recently used item before inserting a new item.
 * The cache is initialized with a positive capacity.
 */
class LRUCache(private val capacity: Int) {

    private val cache = LinkedHashMap<Int, Int>()

    fun get(key: Int): Int {
        val value = cache.remove(key) ?: return -1
        cache[key] = value
        return value
    }

    fun put(key: Int, value: Int) {
        if (cache.containsKey(key)) {
            cache.remove(key)
        }
        if (cache.size >= capacity) {
            cache.remove(cache.keys.iterator().next())
        }
        cache[key] = value
    }

}