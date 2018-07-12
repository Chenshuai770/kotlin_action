package cs.com.kotlinTest.demo4

import cs.com.kotlinTest.demo2.Person
import java.io.File

object Payroll{
    val allEmployees= arrayListOf<Person>()
    fun calculateSalary(){
        for (person in allEmployees){

        }
    }
}

object CaseIn :Comparator<File>{
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path,true)
    }
}

fun main(args: Array<String>) {
    println(CaseIn.compare(File("/User"), File("/user")))

}