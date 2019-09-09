package com.atguigu.day04.work

/**
  * 3. 编写一个函数, 接收一个字符串, 返回一个 Map.
  * 比如: indexes("Helloee")
  *
  * 返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标
  */
object Work3 {
  def main(args: Array[String]): Unit = {
    println("abca".zipWithIndex.toList)
    println("abca".zipWithIndex.toList.groupBy(kv => kv._1))
    val result = returnCharIndex("aaabbbccc")
    println(result)
  }

  def returnCharIndex(str: String) = {
    str.zipWithIndex.groupBy(kv => kv._1).map(kv => {
      kv._1 -> kv._2.unzip._2.toList
    })
  }
}
