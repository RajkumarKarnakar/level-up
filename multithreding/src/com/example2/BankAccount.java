package com.example2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BankAccount {

    private double balance = 100d;

    void debit(double amount) {
        balance -= amount;
    }

    public double getBalance() {
       //System.out.println("Balance checked on " + LocalDateTime.now().toLocalTime());
        return balance;
    }
}
