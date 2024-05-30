package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rajkuMar","baSaVraj","KarnakAr");
        List<String>capitalizedNames = names.stream().map(StringExample::capitalise)
                .collect(Collectors.toList());

        System.out.println(capitalizedNames);
    }
    public static String capitalise(String name){
        return name.substring(0,1).toUpperCase().concat(name.substring(1).toLowerCase());
    }
}
