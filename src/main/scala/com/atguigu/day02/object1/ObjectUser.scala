package com.atguigu.day02.object1

object ObjectUser {
  def main(args: Array[String]): Unit = {
      var user = new User("zhangsan",22,"male")
      println(user.name)
      user.name="zhaosi"
      println(user.name)
      println(user.age)
    var a = 3
    println(s"$a")

  }
}
