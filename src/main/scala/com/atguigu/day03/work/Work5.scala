package com.atguigu.day03.work

/**
  * 5. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
  * 为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
  */
object Work5 {
  def main(args: Array[String]): Unit = {
    val circle = new Circle(2,3)
    circle.centerPoint();
    println(circle.aera)
    val rectangle = new Rectangle(2,2)
    rectangle.centerPoint();
    println(rectangle.aera)
  }
}
class  Circle(a:Double,b:Double) extends Shape{
  private var centerPointX =0
  private var centerPointY =0
  override def centerPoint() = {
    centerPointX = 0
    centerPointY = 0
  }
  def aera:Double={
    var r = math.sqrt((a-centerPointX)*(a-centerPointX)+(b-centerPointY)*(b-centerPointY))
    math.Pi*r*r
  }
}
class  Rectangle(a:Double,b:Double) extends Shape{
  private var centerPointX =0
  private var centerPointY =0

  def aera:Double={
    (a-centerPointX)*(b-centerPointY)*4
  }
  override def centerPoint() = {
    centerPointX = 0
    centerPointY = 0
  }
}

abstract class Shape{

   def centerPoint()
}
