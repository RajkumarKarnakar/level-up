package com.example;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 15,-25,5, 0, 30};
        System.out.println(Arrays.toString(numbers));
        sortAnArray(numbers);
        System.out.println(Arrays.toString(numbers));
        sortAnArray(numbers);
        System.out.println(Arrays.toString(numbers));
        sortAnArray(numbers);
        System.out.println(Arrays.toString(numbers));
        sortAnArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void sortAnArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }

}
