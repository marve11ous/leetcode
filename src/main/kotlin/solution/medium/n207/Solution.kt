package solution.medium.n207

/**
 * 207. Course Schedule
 *
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses-1.
 * Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed
 * as a pair: [0,1]
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 */
class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val dependencies = Array<HashSet<Int>>(numCourses) { HashSet() }
        prerequisites.forEach {
            dependencies[it[0]].add(it[1])
        }
        val allDependencies = Array<HashSet<Int>?>(numCourses) { null }
        for (course in 0 until numCourses) {
            if (getAllDependencies(course, dependencies, allDependencies).contains(course)) {
                return false
            }
        }
        return true
    }

    private fun getAllDependencies(
        current: Int,
        dependencies: Array<HashSet<Int>>,
        allDependencies: Array<HashSet<Int>?>
    ): HashSet<Int> {
        if (allDependencies[current] != null) {
            return allDependencies[current]!!
        }
        val all = HashSet<Int>()
        allDependencies[current] = all
        dependencies[current].forEach {
            all.addAll(dependencies[it])
            dependencies[it].forEach { d -> all.addAll(getAllDependencies(d, dependencies, allDependencies)) }
        }
        return all
    }
}