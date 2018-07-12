package cs.com.kotlinTest.demo4
//Todo data数据类关键字的具体实现原理
class Client(val name: String, val postalCode: Int) {

    /*override fun toString(): String {
        return "Client(name=$name,postalCode=$postalCode)"
    }*/

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client) {
            return false
        }
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }

    fun copy(name: String, postalCode: Int): Client {
        return Client(name, postalCode)
    }
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 234324)
    val client2 = Client("Alice", 234324)
    val client3 = client2.copy(client2.name, client2.postalCode)
    println(client1.equals(client2))
    println(hashSetOf(client1))
    println(hashSetOf(client2))
    println(hashSetOf(client3))
}

