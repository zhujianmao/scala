package com.atguigu.day03.work

/**
  * 4. 设计一个Point类，其x和y坐标可以通过构造器提供。
  * 提供一个子类 LabeledPoint，其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)
  */
object Work4 {
  def main(args: Array[String]): Unit = {
    val point = new LabeledPoint("Black Thursday",1929,230.07)
    println(point.getLabeledPoint)
  }
}

class Point1(x:Double,y:Double)

class LabeledPoint(tag:String,x:Double,y:Double) extends Point1(x,y){
  def getLabeledPoint:String="tag:"+tag+",x:"+x+",y:"+y
}
