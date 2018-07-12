package cs.com.kotlinTest.demo4

interface JSONFactory<T>{
    fun fromJSON(jsonText: String):T
}

class Person1(val name:String){
    companion object :JSONFactory<Person1> {
        override fun fromJSON(jsonText:String):Person1{
            return Person1("gaosho")
        }
    }
}