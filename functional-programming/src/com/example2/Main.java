package com.example2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //numbers.forEach((number)->NumberUtils.oddOrEven(number));

        //OR
        numbers.forEach(NumberUtils::oddOrEven);

    }
}
