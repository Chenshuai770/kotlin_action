package cs.com.kotlinTest.demo4

interface Clickable{
    fun click()
    fun showOff()= println("i'm clickable")
}

interface Focusable{
    fun setFoucuse(b:Boolean){
        println("I ${if (b) "got" else "lost"}foucu.")
    }
    fun showOff()= println("I'm foucusable")
}

class Button :Clickable,Focusable{
    override fun showOff() {
    //super<Focusable>.showOff()
    super<Clickable>.showOff()
    }

    override fun click() {
        println("I was clicked")
    }
}

fun main(args: Array<String>) {
    Button().click()
    Button().showOff()
    Button().setFoucuse(true)
}