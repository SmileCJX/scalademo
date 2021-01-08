package pers.caijx.chapter02.datatype

object TypeDemo01 {

  def main(args: Array[String]): Unit = {
    var num1 : Int = 10
    // 因为Int是一个类，因此他的一个实例，就是可以使用很多的方法
    // 在Scala中，如果一个方法，没有形参，则可以省略（）
    println(num1.toDouble + num1.toString + 100.toDouble)

    var isPass =true
    println(isPass.toString)

    sayHi
    sayHi()
  }

  def sayHi() : Unit = {
    println("say hi")
  }
}
