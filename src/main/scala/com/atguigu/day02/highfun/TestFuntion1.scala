package com.atguigu.day02.highfun

object TestFuntion1 {
  def main(args: Array[String]): Unit = {
    println(operation(2, 3, op))
    println(operation(3, 4, (x, y) => x + y))
    println(operation(4, 5, _ * _))
  }



  def op(x: Int, y: Int)={
    x+y
  }

  def operation(a:Int,b:Int,op:(Int,Int)=>Int)={
    op(a,b)
  }
}
