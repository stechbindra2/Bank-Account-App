package com.stechbindra.bankaccountapp

class BankAccount(var accountHolder:String, var balance:Double) {
    private val transactionHistory = mutableListOf<String>()


    fun deposite(amount:Double){
        balance+=amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount:Double){
        if(amount<=balance){
            //We can withdraw the money :

            balance-=amount
            transactionHistory.add("$accountHolder Remaining amounts in your account is : $$amount")
        }
        else{
            //We cannot withdraw the money from banks
            println("You don't have that have funds to withdraw $$amount")
        }
    }

    fun displayTransationhistory(){
        println("Transation History for $accountHolder")
        for(transation in transactionHistory){
            println(transation)
        }
        
    }
    fun acctBalance(){
        println("Account Balance is for the accountholder $accountHolder is : ${balance}")
        for(transation in transactionHistory){
            println(transation)
            println("Remmainning Balance is ${balance}")
        }
    }
}