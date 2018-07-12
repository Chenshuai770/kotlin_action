package cs.com.kotlinTest.demo3

val haseSet = hashSetOf(1,2,56)

val list = arrayListOf(1,2,445)

val map = hashMapOf(1 to "one",3 to "three")

fun main(args: Array<String>) {
    println(joinToString(list,",","(",")"))
}