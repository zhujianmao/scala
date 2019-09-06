package com.atguigu.day02.controller

object ControlAbstract {
  def main(args: Array[String]): Unit = {
    op(add())
    println("-----------------------------------")
    op1(add)
  }

  def op1(a:Unit)={
    a
    a
    a
  }

  def op(a: =>Unit)={
    a
    a
    a
  }

  def add()={
    println("add ....")
    2
  }

}
