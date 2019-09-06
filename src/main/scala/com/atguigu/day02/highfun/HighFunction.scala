package com.atguigu.day02.highfun

object HighFunction {
  def main(args: Array[String]): Unit = {
    val result = map(Array(1,2,3),_+1)
    println(result.mkString(","))
    val sum1 = sum(Array(1,2,3,4),_+_)
    println(sum1)

  }

  def sum(arr:Array[Int],op:(Int,Int)=>Int)={
    var sum = arr(0)
    for (i <- 1 until arr.length) sum = op(sum,arr(i))
    sum
  }

  def map(arr:Array[Int],op:Int=> Int) ={
    for (i <- arr) yield op(i)
  }

}
