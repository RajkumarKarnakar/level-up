package com.example;

import java.util.Arrays;
import java.util.stream.IntStream;

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
//                .filter(wordForPalindrome -> IntStream.range(0, wordForPalindrome.length() / 2)
//                        .allMatch(i -> wordForPalindrome.charAt(i)
//                                == wordForPalindrome.charAt(wordForPalindrome.length() - 1 - i)))
                .map(s -> s.trim().substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()))
                .forEach(System.out::println);
//
//        String wordForPalindrome = "race";
//        System.out.println(wordForPalindrome + " is palindrome: " +
//                IntStream.range(0, wordForPalindrome.length() / 2)
//                        .allMatch(i -> wordForPalindrome.charAt(i)
//                                == wordForPalindrome.charAt(wordForPalindrome.length() - 1 - i))
//        );

        System.out.println("------words with no vowels------");
        Arrays.stream(words).filter(s -> countVowels(s)==0)
                .forEach(System.out::println);
    }

    static boolean isPalindrome(String original) {
        original = original.toLowerCase();
        for (int i = 0; i <= original.length() - 1; i++) {
            if (original.charAt(i) != original.charAt(original.length() - i - 1))
                return false;
        }

        return true;
    }
    static int countVowels(String s) {
        // Your code goes here.
        int count = 0;
        String vowels = "aeiouy";
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c)!= -1)
                count++;
        }
        return count;
    }
}
