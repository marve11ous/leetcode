package solution.medium.n2271

import kotlin.math.max
import kotlin.math.min

/**
 * [2271. Maximum White Tiles Covered by a Carpet](https://leetcode.com/problems/maximum-white-tiles-covered-by-a-carpet/)
 */
class Solution {
    fun maximumWhiteTiles(tiles: Array<IntArray>, carpetLen: Int): Int {
        val sortedTiles = ArrayList<IntRange>().apply {
            tiles.forEach { add(it[0]..it[1]) }
            sortWith { a, b -> a.first - b.first }
        }
        var tileIndexLeft = 0
        var (initCover, tileIndexRight) = slide(1..carpetLen, 0, sortedTiles)
        var maxDiff = 0
        slide(carpetLen + 1..sortedTiles.last().last, tileIndexRight, sortedTiles) {
            var (coverDiff, range) = this
            slide(range.first - carpetLen until range.last - carpetLen, tileIndexLeft, sortedTiles)
                .let { coverDiff -= it.first; tileIndexLeft = it.second }
            maxDiff = max(maxDiff, coverDiff)
            return@slide coverDiff
        }.let { tileIndexRight = it.second }
        return initCover + maxDiff
    }

    private fun slide(
        range: IntRange,
        startTileIndex: Int,
        sortedTiles: List<IntRange>,
        slide: Pair<Int, IntRange>.() -> Int = { first }
    ): Pair<Int, Int> {
        var cover = 0
        var i = range.first
        var tileIndex = startTileIndex
        while (i <= range.last && tileIndex < sortedTiles.size) {
            val tile = sortedTiles[tileIndex]
            if (i > tile.last) {
                tileIndex++
                continue
            }
            val prev = i
            if (i in tile) {
                cover += min(range.last, tile.last) - i + 1
                i = tile.last + 1
            } else {
                i = tile.first
            }
            cover = slide(cover to prev..i)
        }
        return cover to tileIndex
    }

}