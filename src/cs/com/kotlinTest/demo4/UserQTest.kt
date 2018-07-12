package cs.com.kotlinTest.demo4

interface UserQ {
    val nickName: String

}

//todo 主构造方法属性
class PrivateUserQ(override val nickName: String) : UserQ {

}

//todo 自定义getter
class SubscribingUser(val email: String) : UserQ {
    override val nickName: String
        get() = email.substringBefore('@')
}

fun getFacebookName(accountId: Int): String {
    val facebookName= accountId
    return facebookName.toString()

}


class FacebookUser(val accountId: Int) : UserQ {
    override val nickName = getFacebookName(accountId)

}

fun main(args: Array<String>) {
    val a = FacebookUser(2).nickName
    println(a.toString())
}
