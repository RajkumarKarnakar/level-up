package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class MostRepetitiveWord {
    public static void main(String[] args) {
        String longText = "hi im rajkumar creating this text data as dummy data,," +
                ", this? is for Counting the maximum; WoRd from this Text Text tExt ";

        System.out.println("Most common word from this text is: " + mostCommonWord(longText));
    }

    static List<String> normalise(String text) {
        String[] words = text.toLowerCase().trim()
                .split("[\\n\\r\\t .,/;:?!(){}]");

        List<String> commonWord = List.of("a", "The", "and", "it", "is", "me", "you", "i", "or"
                , "in", "was", "were", "he", "she", "at", "there", "her", "him", "your", "to");

        return Arrays.stream(words)
                .filter(word -> !commonWord.contains(word)
                        && !word.isEmpty())
                .collect(Collectors.toList());
    }

    static String mostCommonWord(String text) {
        List<String> uncommonWords = normalise(text);

        if (uncommonWords.isEmpty()) {
            return "";
        }

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : uncommonWords)
            wordCountMap.put(word, wordCountMap
                    .getOrDefault((String) word, 0) + 1);

        return Collections.max(wordCountMap.entrySet(),
                Map.Entry.comparingByValue()).getKey();
    }
}
