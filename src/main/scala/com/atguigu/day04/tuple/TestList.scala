package com.atguigu.day04.tuple

object TestList {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7,0)
    val list2: List[Int] = List(4, 5, 6, 7, 8, 9, 10)
    println(list1.take(2))
    println(list1.takeRight(2))
    println(list1.drop(2))
    println(list1.zip(list2))
    println(list1.zipAll(list2, -1, -2))
    val tuples = List((1,4), (2,5), (3,6), (4,7), (5,8), (6,9), (7,10), (0,-2))
    println(tuples.unzip)
    println(list1)
    list1.sliding(2, 3).foreach(println)
  }

}
