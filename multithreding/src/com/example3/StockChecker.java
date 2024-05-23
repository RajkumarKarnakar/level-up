package com.example3;

public class StockChecker {

    private int stock = 10;

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity){
        stock-=quantity;
    }
}
