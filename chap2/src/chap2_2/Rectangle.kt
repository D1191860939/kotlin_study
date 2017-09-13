package chap2_2

class Rectangle(val width: Int, val height: Int) {

    val isSquare: Boolean
        get() = width == height
}

fun main(args: Array<String>) {

    val rectangle = Rectangle(120, 100)
    println(rectangle.isSquare)
}