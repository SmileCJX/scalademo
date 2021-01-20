package pers.caijx.chapter02.datatype

object UnitNullNothingDemo {

  def main(args: Array[String]): Unit = {
    var res = sayHello()
    println("res=" + res)

    // Null类只有一个实例对象，null，类似于Java中的null引用。null可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型（AnyVal：比如Int，Float，Char，Boolean，Long，Double，Byte，Short）
    var dog: Dog = null;
//    var char1: Char = null
    println("ok")
  }

  // Unit等价于java的void，只有一个实例值()
  def sayHello() : Unit = {

  }

}

class Dog {

}
