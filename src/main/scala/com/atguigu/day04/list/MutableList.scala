package com.atguigu.day04.list

object MutableList {
  def main(args: Array[String]): Unit = {

    val list = List(3,4,5)
    println(list)
    val list2 = list :+ 3
    println(list2)
    val list3 = 3::4::Nil
    println(list3)
    println(2 :: list3)
    println(list :: list2)
    println(list ::: list2)

  }

}
