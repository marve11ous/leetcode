package solution.medium.n2271

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(
            9,
            solution.maximumWhiteTiles(
                arrayOf(
                    intArrayOf(1, 5),
                    intArrayOf(10, 11),
                    intArrayOf(12, 18),
                    intArrayOf(20, 25),
                    intArrayOf(30, 32)
                ),
                10
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(2, solution.maximumWhiteTiles(arrayOf(intArrayOf(10, 11), intArrayOf(1, 1)), 2))
    }

    @Test
    fun test3() {
        assertEquals(1000000000, solution.maximumWhiteTiles(arrayOf(intArrayOf(1, 1000000000)), 1000000000))
    }

    @Test
    fun test4() {
        assertEquals(
            126,
            solution.maximumWhiteTiles(
                arrayOf(
                    intArrayOf(8051, 8057),
                    intArrayOf(8074, 8089),
                    intArrayOf(7994, 7995),
                    intArrayOf(7969, 7987),
                    intArrayOf(8013, 8020),
                    intArrayOf(8123, 8139),
                    intArrayOf(7930, 7950),
                    intArrayOf(8096, 8104),
                    intArrayOf(7917, 7925),
                    intArrayOf(8027, 8035),
                    intArrayOf(8003, 8011)
                ),
                9854
            )
        )
    }

    @Test
    fun test5() {
        assertEquals(
            822,
            solution.maximumWhiteTiles(
                arrayOf(
                    intArrayOf(3745, 3757),
                    intArrayOf(3663, 3681),
                    intArrayOf(3593, 3605),
                    intArrayOf(3890, 3903),
                    intArrayOf(3529, 3539),
                    intArrayOf(3684, 3686),
                    intArrayOf(3023, 3026),
                    intArrayOf(2551, 2569),
                    intArrayOf(3776, 3789),
                    intArrayOf(3243, 3256),
                    intArrayOf(3477, 3497),
                    intArrayOf(2650, 2654),
                    intArrayOf(2264, 2266),
                    intArrayOf(2582, 2599),
                    intArrayOf(2846, 2863),
                    intArrayOf(2346, 2364),
                    intArrayOf(3839, 3842),
                    intArrayOf(3926, 3935),
                    intArrayOf(2995, 3012),
                    intArrayOf(3152, 3167),
                    intArrayOf(4133, 4134),
                    intArrayOf(4048, 4058),
                    intArrayOf(3719, 3730),
                    intArrayOf(2498, 2510),
                    intArrayOf(2277, 2295),
                    intArrayOf(4117, 4128),
                    intArrayOf(3043, 3054),
                    intArrayOf(3394, 3402),
                    intArrayOf(3921, 3924),
                    intArrayOf(3500, 3514),
                    intArrayOf(2789, 2808),
                    intArrayOf(3291, 3294),
                    intArrayOf(2873, 2881),
                    intArrayOf(2760, 2760),
                    intArrayOf(3349, 3362),
                    intArrayOf(2888, 2899),
                    intArrayOf(3802, 3822),
                    intArrayOf(3540, 3542),
                    intArrayOf(3128, 3142),
                    intArrayOf(2617, 2632),
                    intArrayOf(3979, 3994),
                    intArrayOf(2780, 2781),
                    intArrayOf(3213, 3233),
                    intArrayOf(3099, 3113),
                    intArrayOf(3646, 3651),
                    intArrayOf(3956, 3963),
                    intArrayOf(2674, 2691),
                    intArrayOf(3860, 3873),
                    intArrayOf(3363, 3370),
                    intArrayOf(2727, 2737),
                    intArrayOf(2453, 2471),
                    intArrayOf(4011, 4031),
                    intArrayOf(3566, 3577),
                    intArrayOf(2705, 2707),
                    intArrayOf(3560, 3565),
                    intArrayOf(3454, 3456),
                    intArrayOf(3655, 3660),
                    intArrayOf(4100, 4103),
                    intArrayOf(2382, 2382),
                    intArrayOf(4032, 4033),
                    intArrayOf(2518, 2531),
                    intArrayOf(2739, 2749),
                    intArrayOf(3067, 3079),
                    intArrayOf(4068, 4074),
                    intArrayOf(2297, 2312),
                    intArrayOf(2489, 2490),
                    intArrayOf(2954, 2974),
                    intArrayOf(2400, 2418),
                    intArrayOf(3271, 3272),
                    intArrayOf(3628, 3632),
                    intArrayOf(3372, 3377),
                    intArrayOf(2920, 2940),
                    intArrayOf(3315, 3330),
                    intArrayOf(3417, 3435),
                    intArrayOf(4146, 4156),
                    intArrayOf(2324, 2340),
                    intArrayOf(2426, 2435),
                    intArrayOf(2373, 2376),
                    intArrayOf(3621, 3626),
                    intArrayOf(2826, 2832),
                    intArrayOf(3937, 3949),
                    intArrayOf(3178, 3195),
                    intArrayOf(4081, 4082),
                    intArrayOf(4092, 4098),
                    intArrayOf(3688, 3698)
                ),
                1638
            )
        )
    }
}