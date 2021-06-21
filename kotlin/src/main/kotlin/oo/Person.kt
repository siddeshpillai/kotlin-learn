package oo

open class Person(open val name:String, open var age:Int, open val gender: String = "neutral") {

    fun speak() {
        println("Hi")
    }

    fun greet(name: String) {
        println("Hi $name")
    }

    open fun whoAmI(){
        println("[name:$name, age:$age, gender:$gender]")
    }
}

class Student(override val name: String, override var age: Int, override val gender: String, private val studentId: Int) : Person(name, age, gender) {

    override fun whoAmI(){
        println("[name:$name, age:$age, gender:$gender, studentId:$studentId]")
    }
}

class Employee(override val name: String, override var age:Int, employeeId: Int) : Person(name, age) {

}

fun main(args:Array<String>) {
    val student = Student("Baba", 12, "hetrosexual", 54)
    val employee = Employee("Sandra", 24, 7789)

    student.whoAmI()
    employee.whoAmI()
}