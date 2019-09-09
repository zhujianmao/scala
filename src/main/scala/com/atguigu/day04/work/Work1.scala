package com.atguigu.day04.work

/**
  * 1. 使用 reduce 计算集合中的最大值
  */
object Work1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, -9)
    val max = list.reduce((x, y) => {
      if (x > y) x else y
    })
    println(max)
  }
}
