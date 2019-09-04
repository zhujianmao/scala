package com.atguigu.day01

import scala.xml.Null

object TypeDemo {
  def main(args: Array[String]): Unit = {
    var a : Byte = 126
    a = (a + 2).toByte
    println(a)

    var b : Char = 99;
    println(b)

    println("姓名\t年龄")
    //（5）\n ：换行符
    println("西门庆\n潘金莲")

    //（6）\\ ：表示\
    println("c:\\岛国\\avi")

    //（7）\" ：表示"
    println("同学们都说：\"大海哥最帅\"")

    var isTrue = false;
    println(isTrue)

    println(Unit)
    var input2 = start(666)
    var input3 = start2(666)
    println(input2)
    println(input3)
    println("Null="+Null)

    /*var n1 :Int =null
    println("n1="+n1)*/
    var n2 : String = null
    println("n2="+n2)


    /*def test ={
      throw new Exception
    }
    val result = test
    println("result="+result)*/

    val int = 2.5.toInt
    println("int:"+int)

    val string = true.toString
    println(string.getClass.getSimpleName)

    println("aa"=="aa")
    println("aa"==("aa"+""))

  }

  def start(input:Int):Int={
    input
  }
  def start2(input:Int):Unit={
    input
  }
}
