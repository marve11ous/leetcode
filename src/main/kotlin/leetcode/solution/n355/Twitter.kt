package leetcode.solution.n355

class Twitter {

    private val tweetsByUser = HashMap<Int, HashMap<Int, Int>>()
    private val followers = HashMap<Int, HashSet<Int>>()
    private var tweetCounter = 0

    /** Compose a new tweet. */
    fun postTweet(userId: Int, tweetId: Int) {
        tweetsByUser.computeIfAbsent(userId) { HashMap() }[tweetCounter--] = tweetId
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    fun getNewsFeed(userId: Int): List<Int> {
        follow(userId, userId)
        return followers[userId]?.mapNotNull { tweetsByUser[it]?.entries }?.flatten()
            ?.associateBy({ it.key }, { it.value })
            ?.toSortedMap()?.values?.take(10)?.toList() ?: emptyList()
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    fun follow(followerId: Int, followeeId: Int) {
        followers.computeIfAbsent(followerId) { HashSet() }.add(followeeId)
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    fun unfollow(followerId: Int, followeeId: Int) {
        if (followeeId == followerId) {
            return
        }
        followers[followerId]?.remove(followeeId)
    }

}