package solution.medium.n15

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result: HashSet<MyList> = HashSet()
        var prevI: Int? = null
        iLoop@ for (i in 0 until nums.size - 2) {
            val numI = nums[i]
            if (numI == prevI) {
                continue
            }
            val max = nums[nums.size - 1]
            prevI = numI
            var prevJ: Int? = null
            jLoop@ for (j in i + 1 until nums.size - 1) {
                val numJ = nums[j]
                if (numJ == prevJ) {
                    continue
                }
                prevJ = numJ
                val sumJ = numI + numJ
                if (sumJ > 0) {
                    continue@iLoop
                }
                if (sumJ + max < 0) {
                    continue
                }
                for (k in j + 1 until nums.size) {
                    val numK = nums[k]
                    if (numK < -sumJ) {
                        continue
                    } else if (numK == -sumJ) {
                        result.add(MyList(listOf(numI, numJ, numK)))
                        continue@jLoop
                    } else {
                        continue@jLoop
                    }
                }
            }
        }
        return result.map { it.list }
    }

    class MyList(val list: List<Int>) {
        private val hashCode = calcHashCode()
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as MyList

            return list.containsAll(other.list)
        }

        private fun calcHashCode(): Int {
            val prime = 31
            var result = 1
            result = prime * result + list[0].hashCode()
            result = prime * result + list[1].hashCode()
            result = prime * result + list[2].hashCode()
            return result
        }

        override fun hashCode(): Int {
            return hashCode
        }
    }
}