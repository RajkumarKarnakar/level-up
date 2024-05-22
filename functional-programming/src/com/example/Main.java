package com.example;

import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {

        Greeting helloWorldGreeting = () ->
                System.out.println("Hello World");

        helloWorldGreeting.greet();

        Greeting goodMorningGreeting = ()->
                System.out.println("Good Morning");

        goodMorningGreeting.greet();

        Greeting goodAfternoonGreeting = ()->
            System.out.println("Good Afternoon");

        goodAfternoonGreeting.greet();

    }
}
