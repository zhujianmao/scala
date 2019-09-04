package com.atguigu.day01

import scala.io.StdIn

object StdInDemo {
  def main(args: Array[String]): Unit = {
    val name = StdIn.readLine("请输入姓名:")
    val age = StdIn.readLine("请输入age:")
    val salary = StdIn.readLine("请输入薪水:")
    println(name)
    println(age)
    println(salary)
  }

}
