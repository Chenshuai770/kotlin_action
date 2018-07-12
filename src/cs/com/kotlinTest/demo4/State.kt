package cs.com.kotlinTest.demo4

import java.io.Serializable
import javax.print.attribute.standard.MediaSize

interface State : Serializable

interface View {
    fun getCurrenState(): State
    fun resToreState(state: State) {}
}

class Button1 : View {
    override fun getCurrenState(): State {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun resToreState(state: State) {
        super.resToreState(state)
    }

    inner class ButtonState : State {
        fun opern() = getCurrenState()

    }
}

class Outer {
    inner class Inner {
        fun getOutREference() : Outer {
            return this@Outer
        }
    }
}