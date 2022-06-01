package leetcode.solution.n733

import java.util.*

/**
 * [733. Flood Fill](https://leetcode.com/problems/flood-fill/)
 */
class Solution {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val newImage = Array(image.size) { image[it].copyOf() }
        if (image[sr][sc] != newColor) {
            val stack = LinkedList<Pair<Int, Int>>()
            stack.push(sr to sc)
            while (stack.isNotEmpty()) {
                val (i, j) = stack.pop()
                newImage[i][j] = newColor
                if (i < image.size - 1 && image[i][j] == newImage[i + 1][j]) stack.push(i + 1 to j)
                if (j < image[0].size - 1 && image[i][j] == newImage[i][j + 1]) stack.push(i to j + 1)
                if (i > 0 && image[i][j] == newImage[i - 1][j]) stack.push(i - 1 to j)
                if (j > 0 && image[i][j] == newImage[i][j - 1]) stack.push(i to j - 1)
            }
        }
        return newImage
    }
}