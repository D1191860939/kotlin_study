
/*
    扩展函数
*   1. 如何声明扩展函数
*   - fun 类名.扩展函数名():返回值类型
*
*   2. 如何调用
*   - 2.1 在kotlin中如何调用：和调用普通的实例方法一样，直接通过引用调用
*   - 2.2 在Java中如何调用：和调用Java中的静态方法一样，直接通过类名调用
*
*   3. 扩展函数的本质：
*   - 3.1 是静态函数的一个高效语法糖
*   - 3.2 扩展函数的静态属性决定了扩展函数不能被子类重写
*
*
*
 */

fun String.lastChar(): Char = get(length - 1)

fun main(args: Array<String>) {

    val str = "hello world"

    println(str.lastChar())

}

