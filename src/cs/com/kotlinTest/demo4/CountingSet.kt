package cs.com.kotlinTest.demo4

//todo 定义一个全新的list集合
class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {
    var objectsAdded=0
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded+=c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset1= setOf<Int>()
    var cset=CountingSet<Int>()
    cset.addAll(listOf(1,2,3))
    println("${cset.objectsAdded} objects were added,${cset.size}remain")
}