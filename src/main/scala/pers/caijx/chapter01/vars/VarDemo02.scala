package pers.caijx.chapter01.vars

object VarDemo02 {

  def main(args: Array[String]): Unit = {
    // 类型推导
    var num = 10 // 这是num就是Int类型
    // 方式1，可以利用idea的提示来证明，给出提示
    // 方式2，使用isInstanceOf[Int]判断
    println(num.isInstanceOf[Int])

    // 类型确定后，就不能修改，说明Scala是强类型语言（）
    // num = 2.3 错误

    // 3.在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变脸不可改

    var age = 10 // 即age是可以改变的
    age = 30 // ok

    val num2 = 30
//    num2 = 40 // val 修饰的变量是不可以改变

    // scala设计者为什么设计 var和val
    // （1） 在实际编程中，我们更多的需求是获取创建一个对象后，读取该对象的属性，或者是修改对象的属性值，但是我们很少去改变这个对象本身
    // dog = new Dog() dog.age = 10 dog = new Dog()
    // 这时，我们就可以使用val
    // （2）因为val没有线程安全问题，因此效率高，scala的设计者推荐我们val
    // （3）如果对象需要改变，则使用var

    val dog = new Dog
//    dog = new Dog // Reassignment to val
    dog.age = 90 // ok
    dog.name = "小花" // ok
  }
}

class Dog {

  // 声明一个age，给了一个默认值 _
  var age : Int = 0 //
  // 声明名字
  var name : String = "" //
}
