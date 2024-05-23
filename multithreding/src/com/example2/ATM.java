package com.example2;

public class ATM {

    public synchronized void withdraw(BankAccount account, double amount){
        double balance = account.getBalance();
        if(balance - amount < 0){
            System.out.println("Transaction denied (insufficient balance)");
        }else {
            System.out.format("Transaction for withdraw %.0f initiated...\n",amount);
            account.debit(amount);
            System.out.format("₹%.0f withdrawn successfully\n",amount);;
        }
        System.out.println("Current balance: "+account.getBalance());
    }
}













