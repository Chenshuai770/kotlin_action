package cs.com.kotlinTest.demo4

open class RichButton : Clickable {
    final override fun click() {
    }
    fun disable() {}
    open fun animate() {}
}

class SmallButton: RichButton() {
    override fun animate() {

    }
}