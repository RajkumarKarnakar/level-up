package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {

    public static void main(String[] args) throws IOException {

        Path pathToFile = Paths.get("files\\src\\com\\example\\example.txt");
        Path pathToNewLocation = Paths.get("files\\src\\com\\example\\example2.txt");
//        Files.createFile(pathToNewLocation);
        Files.copy(pathToFile,pathToNewLocation);

    }
}














