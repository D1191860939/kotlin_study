import java.io.File

/*
    Kotlin中object关键字的用途：
    1. 对象声明：实现单例
    - 对象声明和其他类一样，可以声明属性和方法以及初始化语句块等，但是不能够声明构造器（包括主构造器和次级构造器）
    - 也可以以嵌套类的形式来定义对象声明
    - 如何在Java中调用？通过静态字段INSTANCE来调用

    2. 伴生对象（Companion Object）
    - 伴生对象可以访问类中所有的private成员，包括private构造方法

    3. 实现匿名内部类
    - 

 */

object Payroll {

    init {

    }

    val allEmployees = arrayListOf<String>()

    fun calculateSalary() {

    }
}

fun main(args: Array<String>) {

    CaseInsensitiveFileComparator.compare(File("/User"), File("/user"))
}

object CaseInsensitiveFileComparator : Comparator<File> {

    override fun compare(file1: File?, file2: File?): Int {
        return file1?.path?.compareTo(file2?.path!!)!!
    }

}

/*
这是在Android中启动一个Activity推荐的写法，这是静态工厂方法的一种体现
 */
class Activity{

    companion object {

        fun start(activity: Activity){

        }
    }
}