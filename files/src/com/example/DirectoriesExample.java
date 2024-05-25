package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoriesExample {

    public static void main(String[] args) throws IOException {

        Files.list(Paths.get("."))
                .filter(file -> !Files.isDirectory(file))
                .forEach(System.out::println);

//        Files.createDirectories(Paths.get(".\\Exercise"));
        Files.deleteIfExists(Paths.get(".\\Exercise"));
    }
}
