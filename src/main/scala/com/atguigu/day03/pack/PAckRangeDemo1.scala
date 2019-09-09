package com.atguigu.day03.pack

class PAckRangeDemo1 {
  private var name="bobo"
  protected var age =17
  private[pack] var sex = "female"
  def say()={
    println("name-"+name)
  }
}
object PAckRangeDemo1{

  def main(args: Array[String]): Unit = {
      val demo = new PAckRangeDemo1
    println(demo.say())
    println(demo.sex)
  }
}
class  A extends PAckRangeDemo1{
  age
  say()
  sex
}
package B{
  class B1{

  }
}

