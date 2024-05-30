package com.example;

import java.util.Arrays;

public class StringExample2 {
    public static void main(String[] args) {
        String text  = "Hi my name is Rajkumar Karnakar." +
                "have recently completed my diploma in advance computing course." +
                "Im in search for IT job in development field.";

        System.out.println("In text total sentences are: "+text.split("\\.").length);
        String[] words = text.split("[ .]");
        System.out.println("Total words are: "+words.length);
        Arrays.stream(words)
                .map(s->s.trim().substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase()))
                .forEach(System.out::println);
    }
}
