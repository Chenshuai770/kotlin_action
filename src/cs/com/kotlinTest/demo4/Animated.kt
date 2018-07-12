package cs.com.kotlinTest.demo4

abstract class Animated{
    abstract fun animate()
    open fun stopAnimating(){
    }

    fun animateTwice(){

    }
}

class Child : Animated() {
    override fun animate() {
    }

}