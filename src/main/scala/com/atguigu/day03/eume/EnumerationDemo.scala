package com.atguigu.day03.eume

object EnumerationDemo extends Enumeration{
  val Red = Value(1,"Red")

  def main(args: Array[String]): Unit = {
    println(Red)
    println(EnumerationDemo.Value("Red"))
  }
}
