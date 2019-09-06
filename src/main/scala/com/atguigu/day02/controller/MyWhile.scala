package com.atguigu.day02.controller

object MyWhile {
  def main(args: Array[String]): Unit = {
    runInThread{
      println(Thread.currentThread().getName)
    }
    var i =0
    myWhile(i<100){
      println(i)
      i=i+1
    }

  }

  def myWhile(condition: =>Boolean)(op: =>Unit): Unit ={
    if (condition){
      op
      myWhile(condition)(op)
    }
  }

  def runInThread(a: => Unit)={
      new Thread(){
        override def run(): Unit = a
      }.start()
  }

}
