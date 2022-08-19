package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the destination file?");
        String destinationFinal = userInput.nextLine();
        try (PrintWriter dataOutput = new PrintWriter(destinationFinal)) {
            for (int i = 1; i < 301; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    dataOutput.println("FizzBuzz");
                    continue;
                }
                if (i % 3 == 0) {
                    dataOutput.println("Fizz");
                    continue;
                }
                if (i % 5 == 0) {
                    dataOutput.println("Buzz");
                    continue;
                } else {
                    dataOutput.println(i);
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File does not exist.");
        }
    }
}
