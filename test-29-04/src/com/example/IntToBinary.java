package com.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IntToBinary {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intToBinaryUsingInteger(100)));
        System.out.println(Arrays.toString(intToBinaryNotUsingInteger(100)));
    }

    static int[] intToBinaryUsingInteger(int n) {
        int[] numbers = new int[n];
        while (n > 0) {
            numbers[n - 1] = Integer.parseInt(Integer.toBinaryString(n));
            n--;
        }
        return numbers;
    }

    static int[] intToBinaryNotUsingInteger(int n) {
        int[] numbers = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            numbers[i] = current;
            queue.add(current*10);
            queue.add(current*10+1);
        }
        return numbers;
    }
}
