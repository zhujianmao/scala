package com.atguigu.day04.array

object ImmutableArrayDemo1 {
  def main(args: Array[String]): Unit = {
   /* val arr = new Array[Int](3)
    arr(0)=1
    arr(1)=2
    arr(2)=3
    for (ele <- arr) {
      println(ele)
    }*/
    var arr1 = Array(3,4,5)
//    arr1.foreach(x=>println(x))
//    arr1.foreach(println)
    arr1.foreach(println(_))
//    println(arr1.length)
//    println(System.identityHashCode(arr1))
//    val array2 = arr1 :+ 3
//    println(array2.mkString(","))
//    println(System.identityHashCode(array2))
//    val array = 3 +: arr1
//    println(array.mkString(","))
//    println(System.identityHashCode(array))
//    println((arr1 ++ array).mkString(","))
  }
}
