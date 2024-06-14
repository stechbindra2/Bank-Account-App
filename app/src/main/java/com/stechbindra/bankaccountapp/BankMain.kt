package com.stechbindra.bankaccountapp



fun main(){
    val BankAccountshashi = BankAccount("Shashikant kumar Bind", 233545.50)
    val Bankaccountram = BankAccount("ram", 2890.40)
    println(Bankaccountram.accountHolder)
    println(Bankaccountram.deposite(3645.50))
    println(Bankaccountram.withdraw(635.58))
    println(Bankaccountram.displayTransationhistory())
    Bankaccountram.acctBalance()

    //println(BankAccountshashi.accountHolder)
   // BankAccountshashi.deposite(2838.34)
  //  BankAccountshashi.withdraw(243.56)
  //  BankAccountshashi.deposite((2434.89))
   // BankAccountshashi.displayTransationhistory()
   // println("${BankAccountshashi.accountHolder}'s" + "balance is ${BankAccountshashi.balance}")
    BankAccountshashi.acctBalance()

}
