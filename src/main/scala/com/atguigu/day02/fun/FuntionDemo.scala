package com.atguigu.day02.fun

object FuntionDemo {
  def main(args: Array[String]): Unit = {
    printName("hello")
    def test ={
      println("无参,无返回值")
    }
    test
    println("----------------函数参数---------------------------")
    def test1(s:String*)={
      for (i <- s) println(i)
    }
    test1("aaa","bbbb")
    test1()
    println(add(2, 2))
    println(add(y=2,x=6))

  }
  def printName(a:String): Unit ={
    println(a)
  }
  def add(x:Int,y:Int=3):Int={
    x+y
  }
}
