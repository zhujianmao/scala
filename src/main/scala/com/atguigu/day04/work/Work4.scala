package com.atguigu.day04.work

/**
  * 4. 实现一个函数，作用与mkString相同，使用foldLeft
  */
object Work4 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.mkString(","))
    println(myMyStrng(list, "/"))
  }

  def myMyStrng(list: List[Int], segment: String): String = {
    list.foldLeft("")((left, right) => {
      if (left.isEmpty) right.toString
      else left + segment + right
    })
  }
}
