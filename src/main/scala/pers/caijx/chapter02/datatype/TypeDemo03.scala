package pers.caijx.chapter02.datatype

object TypeDemo03 {

  def main(args: Array[String]): Unit = {
    print("long的最大值" + Long.MaxValue + "~" + Long.MinValue)

    var i = 10 // Int
    var j = 10L // j Long
    var e = 9223372036854775807L // 说 9223372036854775807 超过Int

    var num1: Float = 2.2345678912F
    var num2: Double = 2.2345678912
    print("num1=" + num1 + "num2=" + num2)
  }
}
