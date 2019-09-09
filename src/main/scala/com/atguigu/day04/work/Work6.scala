package com.atguigu.day04.work

object Work6 {

  def main(args: Array[String]): Unit = {

    val tuples = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    // (Hello,4),(Scala,4),(Spark,4),(World,4)
    // (Hello,3),(Scala,3),(Spark,3)
    // (Hello,2),(Scala,2)
    // (Hello,1)
    val wordToCountList: List[(String, Int)] = tuples.flatMap {
      t => {
        val strings: Array[String] = t._1.split(" ")
        strings.map(word => (word, t._2))
      }
    }

    println(wordToCountList)

    // Hello, List((Hello,4), (Hello,3), (Hello,2), (Hello,1))
    // Scala, List((Scala,4), (Scala,3), (Scala,2)
    // Spark, List((Spark,4), (Spark,3)
    // Word, List((Word,4))
    val wordToTupleMap: Map[String, List[(String, Int)]] = wordToCountList.groupBy(t => t._1)
    println(wordToTupleMap)
    //    val stringToInts: Map[String, List[Int]] = wordToTupleMap.mapValues {
    //      datas => datas.map(t => t._2)
    //    }
    val stringToInts = wordToTupleMap.map(kv => kv._1 -> kv._2.unzip._2.sum)
    println(stringToInts)
    val sortList2 = stringToInts.toList.sortWith((kv1, kv2) => {
      kv1._2 > kv2._2
    })
    println(sortList2)
    println(sortList2.take(3))
    /*
    val wordToCountMap: Map[String, List[Int]] = wordToTupleMap.map {
        t => {
            (t._1, t._2.map(t1 => t1._2))
        }
    }

    val wordToTotalCountMap: Map[String, Int] = wordToCountMap.map(t=>(t._1, t._2.sum))
    println(wordToTotalCountMap)
    */
  }
}

