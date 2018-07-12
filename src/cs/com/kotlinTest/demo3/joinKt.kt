@file:JvmName("StringFunctions")
package cs.com.kotlinTest.demo3
@JvmOverloads
fun <T> joinToString(collection: Collection<T>,
                     spliterator: String = ",",
                     prefix: String = "",
                     posix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(spliterator)
        }
        result.append(element)
    }
    result.append(posix)
    return result.toString()
}