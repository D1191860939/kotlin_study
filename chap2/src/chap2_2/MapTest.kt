package chap2_2

import java.io.BufferedReader


/*
*
* 1. 总结in关键字的用法
*    - 和for循环一起使用，用来迭代集合、区间
*    - 用来判断某个元素是否属于某个区间，返回值为Boolean
*
*
* 2. Kotlin中的异常和Java中的异常总结最大的区别就是：
*    - Kotlin中并不会区分受检异常和非受检异常
*    - try是作为表达式来处理的，即它是有返回值的，可以通过一个变量去接收，或者是作为表达式的一部分
*
*
*
*
 */
fun main(args: Array<String>) {


    val map = HashMap<String, String>()     
    map.put("zhangsan", "aa")
    map.put("lisi", "bb")
    map.put("wangwu", "cc")


    /*
    *
    * 1. 迭代map的形式：for(（k,v） in map)
    * 2. 可以使用类似数组的方式去获取map的值以及更改
     */
    for ((key, value) in map) {

        println("$key : " + map[key])
    }

    println("----------------------------------")


    val list = listOf("10", "11", "1001")

    for ((index, element) in list.withIndex()) {

        println("$index : $element")
    }

    println("----------------------------------")

    println(isLetter('F'))
    println(isNotDigit('5'))

    println("-----------------------------------")

    println(recognize('$'))
}

fun isLetter(c: Char) = c in 'A'..'Z' || c in 'a'..'z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
        when (c) {
            in '0'..'9' -> "is a digit"
            in 'a'..'z', in 'A'..'Z' -> "is a letter"
            else -> "Unknown!!!"
        }

fun readNumber(reader: BufferedReader): Int? {

    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }


}

