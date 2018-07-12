package cs.com.kotlinTest.demo4

import cs.com.kotlinTest.demo3.User

class UserTest1(val nickname: String,
                val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = UserTest1("Alice")
    val bob = UserTest1("Bob",false)
    println(alice.isSubscribed)
    println(bob.isSubscribed)
}

open class  Uwser(val nickname: String,val age: Int){

    fun Uwser(ssssnickname: String){

    }
}

class TwitterUwser(nickname: String,age: Int) :Uwser(nickname,age){

}