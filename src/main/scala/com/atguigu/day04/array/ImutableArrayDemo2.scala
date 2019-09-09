package com.atguigu.day04.array

object ImutableArrayDemo2 {
  def main(args: Array[String]): Unit = {
    val array = Array(1,2,3)
    println(array.head)
    println(array.last)
    println(array(0))
    println(array.tail.toList)
  }
}
