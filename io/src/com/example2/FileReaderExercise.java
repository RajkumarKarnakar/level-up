package com.example2;

import java.io.*;

public class FileReaderExercise {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\intelliJ-workspace\\level-up\\io\\src\\com\\example2\\FileReaderExercise.java"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\intelliJ-workspace\\level-up\\io\\src\\com\\example2\\FileReaderExercise.txt"))) {
            reader.lines().forEach(line ->{
                    try{
                writer.write(line);
                writer.newLine();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }}
            );
        }
    }
}
