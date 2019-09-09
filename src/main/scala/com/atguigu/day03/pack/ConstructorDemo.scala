package com.atguigu.day03.pack
object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    val demo:ConstructorDemo = new ConstructorDemo(2)
    demo.say("hello world")
    println(demo.a)
  }



}
class ConstructorDemo {
  private val a = "private field"

  def this(age: Int) {
    this
  }

  def say(word: String): Unit = {
    println(word)
  }
}

