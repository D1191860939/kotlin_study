/*
   一、kotlin中的接口
   1. 和Java类似，使用interface关键字来声明一个接口
   2. 和Java8类似，kotlin中接口的方法可以有默认的实现，但是Java8中需要额外的default关键字去声明
   3. 当一个类需要去实现一个接口时，使用冒号来替代Java中的extends和implements关键字
   4. 如果在Java中要去实现在Kotlin中定义的接口时，此时Java类是需要去实现这个接口所有的方法，不管方法是否有默认实现。
      因为带默认实现的接口是编译成一个普通接口和一个类，这个类中的包含静态方法的实现
   5. 接口的方法没有函数体默认都是abstract的，接口中的属性默认都是open的


   二、kotlin中的方法重写：
   1. 在Java中重写的方法使用@Override注解来修饰，但是它在语法上不是必须的，即不添加编译是可以通过的，
      但是在kotlin中，需要显式地使用override关键字来进行修饰，这是从语法层面上要求的，即不添加编译会报错
   2. 当一个类实现了多个接口中方法声明相同，那么此类中默认是不会使用其中任何一个的，这个时候需要显式地提供实现

   三、继承与多态
   1. 如何调用父类的方法：
   - 在Java中通过super.方法名()
   - 在Kotlin中，通过super.方法名()的方式调用，一旦出现了实现的多个接口中都有默认实现并且方法原型相同时，
     此时需要通过super<实现的接口名>.方法名()来显示指定调用特定父接口中的方法
   2. Java中的类和方法默认是可以继承和重写的；kotlin中的类和方法默认是final的，即不能被继承和重写的，如果允许被子类重写
      和继承，那么需要使用open关键字进行显式地声明
   3. 继承控制修饰符：
      open -> 允许被继承和重写，可以作用在方法和类上
      abstract -> 允许被继承和重写，同时表明此类不能够被直接实例化，可以作用在方法和类上
      override -> 表明某个方法是从父类或者接口中重写下来的，只允许作用在方法上，不可以作用在类上
      final -> 表明某个方法和类是不能够被继承和重写的，可以作用在方法和类上，在kotlin中类和方法默认都是final的，
               即不能够被继承和重写；此关键字是不能够被用来修饰接口中的成员的

   4. 可见性修饰符：
   - 在Java中，包括：public、protected、private、默认是包级别的
   - 在kotlin中，包括：public、protected、private、internal，它不包含包级别的访问控制，internal表示只在模块内部
     可见
   - protected在Java中的访问范围是：当前类、子类以及同一个包中；protected在Kotlin中的访问范围是：当前类、子类
   - 在Java中外部类是可以访问内部类的private成员的，而在kotlin中外部类是不允许访问内部类中的private成员

   三、嵌套类和内部类
   - 嵌套类不持有外部类的引用，而内部类持有
   - 默认情况下，如果嵌套类不添加任何修饰时，那么这个嵌套的作用和Java中的静态内部类是类似的，此时是不持有外部类的引用的；
     而如果使用了inner关键字来修饰时，那么该类就是内部类，此时是持有外部类的引用的
   - 如何在内部类中引用外部类对象：this@外部类

   四、sealed关键字
   1. 作用：对可能创建的子类做出严格的限制
   2. 形式：父类的所有子类都必须放置到同一个文件中，外部文件中的类是不能够继承该sealed类
   3. 注意点：
        - 通过sealed修饰的类，默认是open的，即允许被子类继承
        - 在when结构中，一旦分支列全，则不需要默认分支
        - 不能够被实例化，因为它只有一个private的构造器
  




 */
interface Clickable {

    fun click()

    fun showOff() = println("I'm clickable")    //接口的默认实现
}

interface Focuable {

    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable")
}

class Button : Clickable, Focuable {

    override fun showOff() {

    }

    override fun click() {
        println("I was clicked")
    }

}

class RichButton : Clickable {
    override fun click() {

    }

    fun disable() {}

    open fun animate() {}
}

fun main(args: Array<String>) {

//    Button().click()

//    Expr()
}

internal open class TalkiveButton : Focuable{

    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//internal fun TalkiveButton.giveSpeech(){
//
//    yell()
//
//    whisper()
//}

sealed class Expr {

}

class Num(val value: Int): Expr()

class Sum(val left: Expr, val right: Expr): Expr()






































