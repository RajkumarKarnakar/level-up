package com.example3;

import java.util.concurrent.Executors;

public class Store {

    static synchronized void purchase(StockChecker stockChecker, int qnt) {
        int stock = stockChecker.getStock();
        if (stock - qnt < 0){
            System.out.println("Out of stock");
        }else{
            System.out.println("Item is in stock");
            stockChecker.updateStock(qnt);
            System.out.println(qnt + " items purchased");
        }
        System.out.println("Current stock: "+ stockChecker.getStock());
    }

    public static void main(String[] args) {

        var stockChecker = new StockChecker();

        var executorService = Executors.newFixedThreadPool(2);

        executorService.submit(()->purchase(stockChecker,10));
        executorService.submit(()->purchase(stockChecker,10));
        executorService.submit(()->purchase(stockChecker,10));
        executorService.submit(()->purchase(stockChecker,10));

        executorService.shutdown();




    }
}









