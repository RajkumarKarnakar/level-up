package com.example;

import java.util.Arrays;

public class StringExample2 {
    public static void main(String[] args) {
        String text = "Hi my name is Rajkumar Karnakar." +
                "have recently completed my diploma in advance computing course." +
                "Im in search for IT job in development field." +
                "this is for palindrome : maDam RacECAr civic";

        System.out.println("In text total sentences are: " + text.split("\\.").length);
        String[] words = text.split("[ .]");
        System.out.println("Total words are: " + words.length);
        Arrays.stream(words)
                .map(s -> s.trim().substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()))
                .forEach(System.out::println);
        System.out.println("------palindrome---------");
        Arrays.stream(words)
                .filter(StringExample2::isPalindrome)
                .map(s -> s.trim().substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()))
                .forEach(System.out::println);
    }

    static boolean isPalindrome(String original) {
        // Your code goes here.
        original = original.toLowerCase();
        for (int i = 0; i <= original.length() - 1; i++) {
            if (original.charAt(i) != original.charAt(original.length() - i - 1))
                return false;
        }

        return true;
    }
}
