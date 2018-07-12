package cs.com.kotlinTest.demo4

internal open class TalkativeButton:Focusable{
    internal fun yell()= println("Hey!")
    fun whisper()= println("Let's talk")
}

internal fun TalkativeButton.giveSpeech(){
    yell()
    whisper()
}