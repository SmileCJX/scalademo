package pers.caijx.chapter05.fundetails

object Details01 {

  def main(args: Array[String]): Unit = {
    // 形参列表和返回值列表的数据类型可以是值类型和引用类型
    var tiger = new Tiger
    var tiger2 = tet01(10,tiger)
    println(tiger2.name)
    println(tiger.name)
    println(tiger.hashCode() + " " + tiger2.hashCode())
  }

  def tet01(n1: Int,tiger: Tiger):Tiger = {
    println("n1 = " + n1)
    tiger.name = "jack"
    tiger
  }

}

class Tiger {
  // 一个名字属性
  var name = ""
}
