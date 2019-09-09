package com.atguigu.day03.traits

object Test{
  def main(args: Array[String]): Unit = {
    val person = new Person2
    println(person.name)
  }
}

trait TreaitDemo {

  var name:String

  def eat()={
    println("eat....")
  }
}

class Person {

}
class Person2 extends Person with TreaitDemo {
  override var name: String = _

}
