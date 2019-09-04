package com.atguigu.day01

object StringDemo {
  def main(args: Array[String]): Unit = {
    var name : String = "aa"
    var age =18
    println(name+":"+age)
    printf("name=%s age=%d",name,age)
    println()
    println(s"name=$name age=$age")
    println(
      s"""name=$name
         |age=$age""".stripMargin)
  }

}
