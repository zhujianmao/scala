package com.atguigu.day03.work

/**
  * 2. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，
  *   并实现一个函数,检查某张牌的花色是否为红色
  */
object Work2 {
  def main(args: Array[String]): Unit = {
    val card = new Card("♦")
    println(card.toString)
    val check = new Check
    println(check.checkCardIsRed(card))
  }
}

class Card(cardColor:String){
  override def toString: String = cardColor
}

class Check {
  def checkCardIsRed(card:Card):Boolean={
    var result = true;
    if(card.toString != "♦" && card.toString != "♥")
          result = false
      result
  }
}
