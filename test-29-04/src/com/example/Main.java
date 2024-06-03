package com.example;

import java.util.Arrays;

public class Main {
    static int number = 25;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(binaryNumbersArray()));
    }

    static int[] binaryNumbersArray() {
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = Integer.parseInt(Integer.toBinaryString(i));
        }
        return numbers;
    }
}
