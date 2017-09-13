import kotlin.reflect.full.memberProperties

open class Person(val name: String, val age: Int)

class Man constructor(name: String, age: Int, val person: Person) : Person(name, age)


fun main(args: Array<String>) {

    //1. 创建一个Person类型对象
    val person = Person("Alice", 29)

    //2. 拿到Person的KClass对象
    val kClass = person.javaClass.kotlin

    //3. 打印KClass的simpleName
    println(kClass.simpleName)

    //4. 遍历类的所有属性并打印名字
    kClass.memberProperties.forEach { println(it) }

    println("----------------------------------")

    val man = Man("Bob", 30, person)

    val mClass = man.javaClass.kotlin

    println(mClass.simpleName)

    mClass.memberProperties.forEach { println(it) }
}
