package com.atguigu.day02.highfun

object Resurcise {
  def main(args: Array[String]): Unit = {
    println(fn(5))

    f(1000)
  }

  def f(a:Int)={
    for(i<- 1 to a){
      if(isOdd(i))println(i)
    }
  }
  def isOdd(a:Int):Boolean={
    var result =true
    for(i<-2 until a ) {
      if(a%i==0) result = false
    }
    result
  }

  def fn(n:Int):Int={
    if (n==1)1
    else
        n*fn(n-1)
  }
}
