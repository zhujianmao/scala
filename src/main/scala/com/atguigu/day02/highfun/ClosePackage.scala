package com.atguigu.day02.highfun

object ClosePackage {
  def main(args: Array[String]): Unit = {
    var x=10
    def f(a:Int)={
      x+a
    }
    println(f(2))

    println(sum(2, 3, 4))

    val f1 = sum1(2,3)
    println(f1(4))
    println(sum1(2, 3)(4))


  }



  def sum1(a:Int,b:Int)= (c:Int)=>a+b+c


  def sum(a:Int,b:Int,c:Int)={
    a+b+c
  }
}
