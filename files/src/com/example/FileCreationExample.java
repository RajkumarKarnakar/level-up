package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreationExample {

    public static void main(String[] args) throws IOException, IOException {

        Path path = Paths.get("files\\src\\com\\example\\example.txt");
        if (Files.notExists(path))
            Files.createFile(path);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files\\src\\com\\example\\example.txt"))) {
            writer.newLine();
            writer.write("Rajkumar Karnakar is created this file");
        }
        System.out.println("Successfully wrote a message to example.txt!");
    }
}
