package solution.medium.n590

/**
 * [690. Employee Importance](https://leetcode.com/problems/employee-importance/)
 */
class Solution {

    private lateinit var employeesMap: Map<Int, Employee>

    fun getImportance(employees: List<Employee?>, id: Int): Int {
        val total = HashMap<Int, Int>()
        employeesMap = employees.filterNotNull().associateBy { it.id }
        getImportanceInternal(employeesMap[id], total)
        return total[id] ?: 0
    }

    private fun getImportanceInternal(employee: Employee?, total: HashMap<Int, Int>): Int {
        if (employee == null) return 0
        total[employee.id]?.let { return it }
        val imp = employee.importance + employee.subordinates.map { employeesMap[it] }
            .sumOf { getImportanceInternal(it, total) }
        total[employee.id] = imp
        return imp
    }
}

class Employee {
    var id: Int = 0
    var importance: Int = 0
    var subordinates: List<Int> = listOf()
}