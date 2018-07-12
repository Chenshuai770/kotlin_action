package cs.com.kotlinTest.demo3
val filePath="/Users/yole/kotlin-book/chapter.adoc"
val kotlinLogo="""
     | //
    .| //
    ./|
""".trimMargin()

fun parsePath(path:String){
    val derectory =path.substringBeforeLast("/")
    val fullnName =path.substringAfter("/")
    val fileName =fullnName.substringBeforeLast(".")
    val extension =fullnName.substringAfterLast(".")
    println(" Dir: $derectory\n fileName: $fileName\n ext: $extension ")
}

fun parsePath1(path :String){

}

fun main(args: Array<String>) {
    //println("123.34.A".split("\\.|-".toRegex()))
    //println(parsePath(filePath))
    println(kotlinLogo.trimMargin("."))
}

