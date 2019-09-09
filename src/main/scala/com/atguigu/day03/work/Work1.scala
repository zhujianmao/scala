package com.atguigu.day03.work

/**
  * 1. 定义一个 Point 类和一个伴生对象,使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例
  */
object Work1 {
  def main(args: Array[String]): Unit = {
    Point(3,4)
  }
}

class Point{
  def this(x:Double,y:Double)={
    this
    println("x:"+x+",y:"+y)
  }
}
object Point{
  def apply(x: Double, y: Double): Point = new Point(x, y)
}
