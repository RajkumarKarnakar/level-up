package com.example2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) {

        try {
            //create a new empty file called example.txt inside folderA

            Path path = Paths.get("files\\src\\com\\example2\\folderA\\example.txt");
            if(Files.notExists(path)){
                Files.createFile(path);
            }

            //copy the file to folderB

            Path newPath = Paths.get("files\\src\\com\\example2\\folderB\\example.txt");
            if(Files.notExists(newPath)){
                Files.copy(path,newPath);
            }
            //List the content of folderB to check that your file is in there

            Files.list(Paths.get("files\\src\\com\\example2\\folderB"));
        } catch (IOException e) {
            e.getStackTrace();
        }


    }
}
