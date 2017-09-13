/*
    可变参数：
    Java中可变参数的注意点：
    1. 语法格式为：类型...
    2. 可变参数要作为方法的最后一个参数
    3. 可变参数本质上是数组

    Kotlin中的可变参数的注意点：
    1. 语法格式：  vararg 参数名:参数类型
    2. 如果需要传递的参数已经包装在了数组之中，那么在Java中是可以直接传递的，而在Kotlin中
       需要使用展开运算符展开数组的内容
 */
fun max(vararg numbers: Int): Int {

    return numbers.max() ?: 0
}

fun main(args: Array<String>) {


    val list = listOf("args: ", *args)
    println(list)
}

