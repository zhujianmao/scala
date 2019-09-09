package com.atguigu.day04.work

import scala.io.Source

/**
  * 5. 实现一个 scala 版的 wordcount
  * 读取文件, 然后实现
  * Source.
  */
object Work5 {
  def main(args: Array[String]): Unit = {
    var path = "E:\\code\\idea\\scala-0508\\src\\main\\resources\\wordcount"
    val lines = Source.fromFile(path).getLines().toList
    println(lines)
    var first = linewordcount(lines(0))
    if(lines.length==1) {
      println(first)
      println("只有一行")
      return
    }
    for(i <- 1 until lines.size ){
      val map = linewordcount(lines(i))
      first = twoToOneMap(map,first)
    }
    println(first)
   /* val result = lines.reduce((line1, line2) => {
      val list1 = linewordcount(line1).toList
      val list2 = linewordcount(line2).toList
      val list = list1 ::: list2
      list.groupBy(kv => kv._1).map(kv => {
        kv._1 -> kv._2.unzip._2.sum
      })
    })
    println(result)*/
  }

  def twoToOneMap(map1:Map[String,Int],map2:Map[String,Int])={
    val list = map1.toList ::: map2.toList
    list.groupBy(kv => kv._1).map(kv => {
      kv._1 -> kv._2.unzip._2.sum
    })
  }

  def linewordcount(line:String)={
    line.split(" ").toList.groupBy(word=>word).map(kv=>kv._1->kv._2.length)
  }
}
