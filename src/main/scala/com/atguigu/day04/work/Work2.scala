package com.atguigu.day04.work

/**
  * 2. 使用 foldLeft 同时计算最大值和最小值
  */
object Work2 {
  def main(args: Array[String]): Unit = {

    var list = List(1, 2, 3, 4, 5, -3, 8)
    val tuple = list.foldLeft((list(0), list(0)))((t, v) => {
      var min = t._1
      var max = t._2
      if (t._1 > v) min = v
      if (t._2 < v) max = v
      min -> max
    })
    println(tuple)
  }
}
