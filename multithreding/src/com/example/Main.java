package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        /*

        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.println("Hello from a lambda style runnable"));

        threadOne.start();
        threadTwo.start();

        */

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableExample());
        executorService.submit(() -> System.out.println("Hello world from a runnable running in an executor"));
        executorService.shutdown();
    }
}
















