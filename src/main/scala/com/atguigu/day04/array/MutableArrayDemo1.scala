package com.atguigu.day04.array

import scala.collection.mutable

object MutableArrayDemo1 {
  def main(args: Array[String]): Unit = {

    val arrayBuffer = mutable.ArrayBuffer(1,2,3)
    println(arrayBuffer.length)
    println(arrayBuffer.size)
    println(System.identityHashCode(arrayBuffer))
    println(arrayBuffer(0))
    arrayBuffer.update(0,11)
    println(arrayBuffer(0))

    println(arrayBuffer :+ 2)
    val buffer = arrayBuffer :+ 2
    println(System.identityHashCode(buffer))
    arrayBuffer.append(4)
    println(System.identityHashCode(arrayBuffer))
    println(arrayBuffer.toList)
    arrayBuffer.insert(2,1)
    println(arrayBuffer.toList)

  }
}
