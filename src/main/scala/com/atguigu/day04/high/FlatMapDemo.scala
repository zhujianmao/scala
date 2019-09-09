package com.atguigu.day04.high

import scala.collection.mutable

object FlatMapDemo {
  def main(args: Array[String]): Unit = {
    val list = List(("hello hello"),("hadoop hive"),("scala"))
    println(list.flatMap(x => x.split(" ")))
    println(list.flatMap(_.split(" ")).groupBy(x=>x))
    val map = list.flatMap(_.split(" ")).groupBy(x=>x).map(kv=>{kv._1 -> kv._2.length})
    println(map)
    println(list.flatMap(_.split(" ")))
    println(list.flatMap(_.split(" ")).foldLeft(mutable.Map[String, Int]())((map, word) => {
      map += (word -> (map.getOrElse(word, 0) + 1))
    }))


  }

}
