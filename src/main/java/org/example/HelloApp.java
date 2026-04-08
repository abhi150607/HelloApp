package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Join names using comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}