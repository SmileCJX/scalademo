package pers.caijx.chapter02.datatype

object TypeDemo02 {

  def main(args: Array[String]): Unit = {
    println(sayHello)

    var num = 1.2 // 数值默认为double类型
    var num2 = 1.7f // 这是float类型
    num2 = num.toFloat
//    num2 = num // error 遵循隐式转换
  }

  // 比如在开发中，我们有一个方法，就会异常中断，这时就可以返回Nothing|
  // 即当我们用Nothing做返回值，就是明确说明该方法没有正常的返回值
  def sayHello: Nothing = {
    throw new Exception("抛出异常")
  }
}
