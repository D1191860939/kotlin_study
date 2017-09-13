package chap2_2

/*
 * kotlin中的枚举类
 * 1. 和普通类一样，可以定义构造器和成员
 * 2. 声明时必须同时使用enum class两个关键字
 * 3. 常量的声明和函数的声明之间必须通过分好分隔开，这也是kotlin中唯一需要使用分号的地方
 * 4. enum是一个所谓的软关键字，即只有当它出现在class前面才有特殊的意义，在其他地方可以把它当做普通的名称使用
 */
enum class Color(val r: Int, val g: Int, val b: Int) {

    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

/*
 * 1. when同java中的switch
 * 2. when和switch相比：
 *      - 通常需要显式地使用break语句，而when不需要
 *      - switch在Java是语句，而when是表达式
 *      - when中是带有类型转换的，即和if类似，只需要判断是否是某种类型，接下来不需要类型转换
 *        就可以当做该类型直接使用
 *      - switch中的参数是有类型限制的，byte、short、int、long、char、枚举以及String（1.7支持）
 *        when中是没有任何参数限制
 *      - switch中使用default来表示默认分支，而when中使用else来表示默认分支
 *
 */
//Richard Of York Gave Battle In Vain
fun getMnemonic(color: Color) =

        when (color) {

            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "INDIGO"
            Color.VIOLET -> "Vain"

        }


fun main(args: Array<String>) {

    println(getMnemonic(Color.BLUE))
}