package com.atguigu.day03.extend

class ExtendsDemo {
    def this(name:String,age:Int,sex:String){
      this
      println("father constructor")
    }


}

object ExtendsDemo{
  def aply()=new ExtendsDemo()
  def apply(name: String, age: Int,sex:String): ExtendsDemo = new ExtendsDemo(name, age,sex)
  def main(args: Array[String]): Unit = {
    new ExtendsDemo("jack",20,"male")
    new subExtendsDemo("zhaosi",19,"male")
    ExtendsDemo("rose",18,"female")
    ExtendsDemo

  }
}
class subExtendsDemo(name:String,age:Int,sex:String) extends ExtendsDemo(name,age,sex) {
  println("sub constructor")
}

