package com.example2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Customer {

    public static void main(String[] args) {
        ATM atm = new ATM();
        BankAccount account = new BankAccount();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(()-> atm.withdraw(account,51));
        executorService.submit(()-> atm.withdraw(account,50));

        executorService.shutdown();
    }
}











