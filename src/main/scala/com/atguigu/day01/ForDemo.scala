package com.atguigu.day01

object ForDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10)
      print(i)
    println()
    for (i <- 1 to(10, 2))
      print(i)
    println()
    for (i <- 1 until 10)
      print(i)
    println()
    for (i <- 10 to(1, -1))
      print(i)
    println()
    for (i <- 1 to 10 reverse)
      print(i)
    println()
    for (i <- 1 to 10 if i < 5)
      print(i)
    println()
    var arr = Array("aa", "bb", "cc")
    for (i <- 0 to (arr.length - 1))
      println(arr {
        i
      })
    for (i <- 1 to 10 by 2)
      print(i)
    println()

    val ints = for (i <- 1 to 10) yield i
    println(ints)

    for (i <- 1 to 3; j <- 1 to 3) {
      println(" i =" + i + " j = " + j)
    }


    for (i <- 1 to 9; j <- 1 to i) {
      printf(i + "*" + j + "=" + i * j + "\t")
      if (i == j) println()
    }
  }
}
