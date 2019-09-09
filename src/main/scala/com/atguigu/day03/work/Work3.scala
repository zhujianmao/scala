package com.atguigu.day03.work

/**
  * 3. 扩展如下的 BankAccount类，新类 CheckingAccount 对每次存款和取款都收取1美元的手续费 
  *
  * class BankAccount(initialBalance: Double) {
  * private var balance = initialBalance
  *
  * def deposit(amount: Double) = {
  * balance += amount
  * balance
  * }
  *
  * def withdraw(amount: Double) = {
  * balance -= amount
  * balance
  * }
  * }
  */
object Work3 {
  def main(args: Array[String]): Unit = {
      val accountext = new CheckingAccountext(500,2)
    println(accountext.deposit(202))
    println(accountext.withdraw(198))
  }
}

class CheckingAccountext(initialBalance: Double,precedureFee:Double) extends BankAccount(initialBalance){



  override def deposit(amount: Double): Double = {
    super.deposit(amount-precedureFee)
  }

  override def withdraw(amount: Double): Double = {
    super.withdraw(amount+precedureFee)

  }

}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}
