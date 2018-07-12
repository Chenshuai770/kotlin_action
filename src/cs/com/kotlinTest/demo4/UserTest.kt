package cs.com.kotlinTest.demo4

import java.awt.Container
import javax.naming.Context
import javax.swing.text.AttributeSet

class UserTest private constructor(_nickname: String) {
    val nickname: String
    init {
        nickname=_nickname
    }
}

open class ViewText{
    constructor(ctx:Context)

    constructor(ctx: Context,atr:AttributeSet)
}

class MyButton : ViewText {
    constructor(ctx: Context):super (ctx){

    }
    constructor(ctx: Context,atr: AttributeSet):super(ctx,atr){

    }
}

