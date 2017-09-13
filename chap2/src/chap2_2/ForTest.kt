package chap2_2

fun main(args: Array<String>) {

    for (i in 1..100)
        print(fizzBuzz(i))

    println("\n--------------------")

    println(sum(11))
}

//打印1到100之间的所有数字的正确答案
fun fizzBuzz(i: Int): String =
        when {

            i % 3 == 0 -> "fizz "
            i % 5 == 0 -> "buzz "
            i % 3 == 0 && i % 5 == 0 -> "fizzBuzz "
            else -> "$i "
        }

fun sum(count: Int): Int {

    var value = 0
    for (i in 1 until count) {

        value += i
    }

    return value
}