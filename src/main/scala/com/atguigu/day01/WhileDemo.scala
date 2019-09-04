package com.atguigu.day01

import scala.util.control.Breaks._

object WhileDemo {
  def main(args: Array[String]): Unit = {
    var n = 1
    breakable {
      while (n<10){
        println("n="+n)
        n += 1
        if(n==5)break
      }
    }
    n=0
    while (n<10){
      breakable{
        n += 1
        if(n%2!=0){
          println(n)
        }else{
          println("contiune")
          break
        }
      }
    }

  }
}
