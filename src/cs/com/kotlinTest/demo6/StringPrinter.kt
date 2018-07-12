package cs.com.kotlinTest.demo6

val value=null
class StringPrinter:StringProcessor{
    override fun process(value: String) {
        println(value)
    }
}

class NullalbeStringPrinter:StringProcessor{


    override fun process(value: String?) {
        value?: println(value)

    }
}

fun main(args: Array<String>) {

}