package com.example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String[] args) {
        try(var reader = new BufferedReader(new FileReader("D:\\intelliJ-workspace\\level-up\\io\\src\\com\\example2\\example.txt"))){
//            String firstLine = reader.readLine();
//            System.out.println(firstLine);

            StringBuilder stringBuilder = new StringBuilder();
            reader.lines().forEach(line ->stringBuilder.append(line+"\n"));
            System.out.println(stringBuilder);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}








