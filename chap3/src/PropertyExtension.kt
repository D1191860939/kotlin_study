/*
    扩展属性
    1. 语法格式：
       var 类名.扩展属性名: 属性类型
       get() = ...
       set(value: 类型）{

       }
 */

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    println(sb.lastChar)

}

