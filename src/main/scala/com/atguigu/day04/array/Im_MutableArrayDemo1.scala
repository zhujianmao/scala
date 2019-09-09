package com.atguigu.day04.array

object Im_MutableArrayDemo1 {
  def main(args: Array[String]): Unit = {
    val array = Array(1,2,3)
    println(array.getClass.getSimpleName)
    println(array.mkString(","))
    val buffer = array.toBuffer
    println(buffer.getClass.getSimpleName)
    println(array.mkString(","))
    println(buffer.mkString(","))
    buffer += 3
    println(buffer.mkString(","))
  }
}
