package cs.com.kotlinTest.demo4

class A{
    companion object {
        fun  bar(){
            println("Companion object called")
        }
    }
     fun bar1(){
        println("需要实列")
    }
}

fun main(args: Array<String>) {
    println(A.bar())

    val a=A()
    println(a.bar1())
}