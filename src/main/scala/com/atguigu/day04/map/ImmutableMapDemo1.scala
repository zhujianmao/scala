package com.atguigu.day04.map

object ImmutableMapDemo1 {
  def main(args: Array[String]): Unit = {
    val map = Map("a"->97,"b"->98,("c",99))
    map.map(println)
    map.map(kv=>println(kv._1))
    map.map(kv=>println(kv._2))
    println(map.get("a"))
    println(map("c"))
    println(map.getOrElse("d", 100))
  }
}
