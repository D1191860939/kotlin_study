/*
* 1. 命名参数（Named Parameter）：出现在函数调用处
*
*
* 2. 默认参数值：解决Java中重载的问题，出现在函数声明处
*
* 3. 顶层函数和顶层属性
*
* 4. 
 */

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3)

//    println(joinToString(list, ",", "(", ")"))

    println(joinToString(list, prefix = "[", postfix = "]"))
}

fun <T> joinToString(c: Collection<T>, separator: String = ",", prefix: String = "(", postfix: String = ")"): String {


    val sb = StringBuilder(prefix)

    for ((index, element) in c.withIndex()) {

        if (index > 0)
            sb.append(separator)

        sb.append(element)
    }

    sb.append(postfix)

    return sb.toString()


}




