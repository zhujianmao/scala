package com.atguigu.day01

import scala.io.StdIn

object IfDemo {
  def main(args: Array[String]): Unit = {
    var input = StdIn.readLine("请输入数字").toInt
    val ifResult = if (input > 0) {
      println("你输入的数大于0")
      88
  } else{
      println("你输入的数小于等于0")

      99
    }
    println(ifResult)
  }

}
