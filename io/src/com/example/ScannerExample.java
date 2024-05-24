package com.example;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your age is: "+ age);

        System.out.println("Please enter your occupation");
        String occupation = scanner.nextLine();
        System.out.println("Your occupation is: "+ occupation);


    }
}
