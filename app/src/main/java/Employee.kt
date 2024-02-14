//OPGAVE 1
open class Employee(firstName: String, lastName: String, monthlySalary: Int) {
    val firstName: String = firstName
    val lastName: String = lastName

    private var _monthlySalary: Int

    init {
        _monthlySalary = if (monthlySalary > 0) monthlySalary else 0
    }

    var monthlySalary: Int
        get() {
            return _monthlySalary;
        }
        set(value: Int) {
            if (value >= 0) {
                _monthlySalary = value
            } else {
                println("Salary is 0.0")
            }
        }

    fun yearlySalary(): Int {
        return _monthlySalary * 12
    }

    fun raise(): Double {
        return (_monthlySalary + (_monthlySalary * 0.1)) * 12
    }
}