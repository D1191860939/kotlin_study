/*
   1. 在kotlin中，==的效果是和Java中的equals方法是一致的，即一旦重写了equals和hashCode两个方法来指定相等规则后
      通过==运算符的结果就是true

   2. data class ：数据类
      - hashCode和equals方法只会将声明在主构造器中的属性纳入考虑


 */

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {

    val client = Client("zhangsan", 114)
    println("before copy : $client")

    println("-----------------------------")

    val copyClient = client.copy(name = "lisi", postalCode = 152)

    println("before copy : " + client)
    println("after copy : " + copyClient)


}