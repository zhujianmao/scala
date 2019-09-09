package com.atguigu.day04.array

object MultArrayDemo1 {
  def main(args: Array[String]): Unit = {
    val array = Array((1,2,3),(2,3,4))
    println(array.length)
    array.map(println)
    val array2 = Array.ofDim[Int](2,3)
    array2(0)(0) = 1
    array2.map(println)
  }
}
