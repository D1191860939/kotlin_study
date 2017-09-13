open class View {

    open fun click() = println("View clicked")
}

class Button : View() {

    override fun click() = println("Button clicked")
}

fun View.setEnable() {

    println("View setEnabled")
}

fun Button.setEnable() {

    println("Button setEnabled")
}

fun main(args: Array<String>) {

    val view: View = Button()
    view.click()

    println("-------------------")

    val v = Button()
    v.setEnable()

    println("--------------------")

    val v2: View = Button()
    v2.setEnable()

}