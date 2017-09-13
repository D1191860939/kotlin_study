package chap2_2

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =


        //方式一：使用is来实现
//    if (e is Num){
//        return e.value
//    }
//
//    if (e is Sum){
//        return eval(e.left) + eval(e.right)
//    }
//
//    throw IllegalArgumentException("Unknown expression")

        //方式二：使用when结构来实现
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else ->
                throw IllegalArgumentException("unknown expression")
        }


fun main(args: Array<String>) {

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}