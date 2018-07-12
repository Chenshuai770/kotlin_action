package cs.com.kotlinTest.demo4

interface UserA {
    val email: String
    val nickName: String
        get() = email.substringBefore('@')
}

class LengthCounter{
    var counter:Int=0
    private set //私有化变量,只能在类内部访问

    fun addWord(word :String){
        counter+=word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter=LengthCounter()
    println(lengthCounter.addWord("Hi!"))
    println(lengthCounter.counter)

}






